package _11_multi_thread.create_run_example;

public class BeepPrintExample3 {

    public static void main(String[] args) {
        Thread thread = new BeepThread();
        thread.start(); // 자신의 run() 메소드를 실행하게 됨

        /*
        // 익명 객체 이용
        Thread thread1 = new Thread() {
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
        };
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