package _16_io.console;

import java.io.InputStream;

public class SystemInExample1 {

    public static void main(String[] args) throws Exception {
        System.out.println("== 메뉴 ==");
        System.out.println("1. 예금 조회");
        System.out.println("2. 예금 출금");
        System.out.println("3. 예금 입금");
        System.out.println("4. 종료");
        System.out.println("메뉴를 선택하세요: ");

        InputStream is = System.in; // 키보드 입력 스트림 얻기
        char inputChar = (char) is.read();  // 아스키 코드를 일고 문자로 리턴
        switch (inputChar) {
            case '1':
                System.out.println("예금 조회를 선택하셨습니다.");
                break;
            case '2':
                System.out.println("예금 출금을 선택하셨습니다.");
                break;
            case '3':
                System.out.println("예금 입금을 선택하셨습니다.");
                break;
            case '4':
                System.out.println("종료를 선택하셨습니다.");
                break;
        }
    }

}

/*
    결과
        == 메뉴 ==
        1. 예금 조회
        2. 예금 출금
        3. 예금 입금
        4. 종료
        메뉴를 선택하세요:
        3
        예금 입금을 선택하셨습니다.

 */