package _03_conditional_statement_and_repeat_statement;

public class BreakOuterExample {

    public static void main(String[] args) {
        Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);

                if (lower == 'g') {
                    break Outter;
                }
            }
        }

        System.out.println("프로그램 실행종료");
    }

}

/*
    결과
        A-a
        A-b
        A-c
        A-d
        A-e
        A-f
        A-g
        프로그램 실행종료
 */