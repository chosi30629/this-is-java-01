package _11_multi_thread.threadpool_example;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
    private ExecutorService executorService;


    public CallbackExample() {
        executorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
        );
    }

    // 콜백 메소드를 가진 객체
    private CompletionHandler<Integer, Void> callback =
    new CompletionHandler<Integer, Void>() {
        @Override
        public void completed(Integer result, Void attachment) {
            System.out.println("completed() 실행: " + result);
        }

        @Override
        public void failed(Throwable exc, Void attachment) {
            System.err.println("failed() 실행: " + exc);
        }
    };

    public void doWork(final String x, final String y) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;
                    callback.completed(result, null);
                } catch (NumberFormatException e) {
                    callback.failed(e, null);
                }
            }
        };
        executorService.submit(task);
    }

    public void finish() {
        executorService.shutdown();
    }

    public static void main(String[] args) {
        CallbackExample example = new CallbackExample();
        example.doWork("3", "3");
        example.doWork("3", "삼");
        example.finish();
    }

}

/*
    결과
        completed() 실행: 6
        failed() 실행: java.lang.NumberFormatException: For input string: "삼"
 */