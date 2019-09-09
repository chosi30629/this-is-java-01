package _02_operator;

public class LogicalOperatorExample {

    public static void main(String[] args) {
        int charCode = 'A';

        if ((charCode >= 65) & (charCode <= 90)) {
            System.out.println("대문자");
        }

        if ((charCode >= 97) && (charCode <= 122)) {
            System.out.println("소문자");
        }

        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0 ~ 9 숫자");
        }

        int value = 6;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수");
        }

        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수");
        }
    }

}

/*
    && 는 앞의 피연사자가 false 라면 뒤의 피연산자를 평가하지 않는다.
    || 는 앞의 피연산자가 true 라면 뒤의 피연산자를 평가하지 않는다.
    & 나 | 는 무조건 둘 다 평가해서 산출결과를 나타낸다.

    결과
        대문자
        2 또는 3의 배수
        2 또는 3의 배수

 */