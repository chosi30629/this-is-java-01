package _03_conditional_statement_and_repeat_statement;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q 를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(">");
            inputString = scanner.nextLine();   // 키보드로 입력한 문자열을 얻음
            System.out.println(inputString);
        } while (!inputString.equals("q"));     // q 입력시 false 로 바꾸고 반복문 종료. while() 뒤에 ; 필수

        System.out.println();
        System.out.println("프로그램 종료");
    }

}
