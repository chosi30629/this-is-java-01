package _11_multi_thread.create_run_example;

public class BeepPrintExample2 {

    public static void main(String[] args) {
        Runnable beepTast = new BeepTask();
        Thread thread = new Thread(beepTast);
        thread.start();

        /*
        // Runnable 익명 객체 이용
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {}
                }
            }
        });

        // 람다식 이용
        Thread thread2 = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
            }
        });
        */

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }

}

/*
    결과
        비프음과 동시에 띵 출력
        띵
        띵
        띵
        띵
        띵
 */