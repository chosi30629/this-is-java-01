package _03_conditional_statement_and_repeat_statement;

public class ForFloatCounterExample {

    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }
    }

}

/*
    초기화식에서 루프 카운트 변수를 선언할 때 부동소수점 타입을 사용하지 말자.

    결과

        0.1
        0.2
        0.3
        0.4
        0.5
        0.6
        0.70000005
        0.8000001
        0.9000001
 */