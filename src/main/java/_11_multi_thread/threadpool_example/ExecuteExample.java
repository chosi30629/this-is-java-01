package _11_multi_thread.threadpool_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);  // 최대 스레드 개수가 2개인 스레드풀 생성

        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    // 스레드 총 개수 및 작업 스레드 이름 출력
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);

                    // 예외 발생 시킴
                    int value = Integer.parseInt("삼");
                }
            };

//            executorService.execute(runnable);
            executorService.submit(runnable);

            Thread.sleep(10);   // 콘솔에 출력 시간을 주기 위해 0.01초 일시 정지
        }

        executorService.shutdown();   // 스레드풀 종료
    }

}

/*
    execute 결과 - 작업 처리 도중 예외가 발생했기 때문에 해당 스레드는 제거되고 새 스레드가 계속 생성
        [총 스레드 개수: 1] 작업 스레드 이름: pool-1-thread-1
        Exception in thread "pool-1-thread-1" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-3
        Exception in thread "pool-1-thread-3" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-2
        Exception in thread "pool-1-thread-2" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-4
        Exception in thread "pool-1-thread-4" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-5
        Exception in thread "pool-1-thread-5" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-6
        Exception in thread "pool-1-thread-6" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-7
        Exception in thread "pool-1-thread-7" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-8
        Exception in thread "pool-1-thread-8" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-9
        Exception in thread "pool-1-thread-9" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-10
        Exception in thread "pool-1-thread-10" java.lang.NumberFormatException: For input string: "삼"
            at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
            at java.lang.Integer.parseInt(Integer.java:580)
            at java.lang.Integer.parseInt(Integer.java:615)
            at _11_multi_thread.threadpool_example.ExecuteExample$1.run(ExecuteExample.java:23)
            at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
            at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
            at java.lang.Thread.run(Thread.java:748)
 */

/*
    submit 결과 - 예외가 발생하더라도 스레드가 종료되지 않고 계속 재사용되어 다른 작업 처리
        [총 스레드 개수: 1] 작업 스레드 이름: pool-1-thread-1
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-2
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-1
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-2
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-1
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-2
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-1
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-2
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-1
        [총 스레드 개수: 2] 작업 스레드 이름: pool-1-thread-2
 */