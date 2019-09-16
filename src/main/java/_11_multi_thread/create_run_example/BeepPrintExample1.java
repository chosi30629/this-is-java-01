package _11_multi_thread.create_run_example;

import java.awt.*;

public class BeepPrintExample1 {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }

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
        비프음 5번 울린 다음
        띵
        띵
        띵
        띵
        띵
 */