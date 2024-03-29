package _10_basic_api_class.string_class;

public class StringIndexOfExample {

    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        if (subject.indexOf("자바") != -1) {
            System.out.println("자바와 관련된 책이군요");
            return;
        }
        System.out.println("자바와 관련없는 책이군요");
    }

}

/*
    결과
        3
        자바와 관련된 책이군요
 */