package _16_io.console;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력> ");
        String inputString = scanner.nextLine();
        System.out.println(inputString);
        System.out.println();

        System.out.print("정수 입력> ");
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);
        System.out.println();

        System.out.print("실수 입력> ");
        double inputDouble = scanner.nextDouble();
        System.out.println(inputDouble);
    }

}

/*
    결과
        문자열 입력> 하이
        하이

        정수 입력> 98
        98

        실수 입력> 0.00
        0.0
 */