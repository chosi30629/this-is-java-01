package _11_multi_thread.status_control_example;

import java.awt.*;

public class SleepExample {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
    }

}

/*
    결과
        3초 주기로 10번 비프음 발생
 */