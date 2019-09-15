package _10_basic_api_class.math_random_class;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        // 선택번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.print("선택 번호: ");
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨번호
        int[] winningNumber = new int[6];
        System.out.print("당첨 번호: ");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        // 당첨여부
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber, winningNumber);
        if (result) {
            System.out.println("1등에 당첨되셨습니다.");
            return;
        }
        System.out.println("당첨되지 않았습니다.");
    }

}

/*
    결과
        선택 번호: 15 21 16 17 34 28
        당첨 번호: 40 35 20 32 31 38
        당첨되지 않았습니다.
 */