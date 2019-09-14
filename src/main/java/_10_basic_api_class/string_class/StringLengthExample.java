package _10_basic_api_class.string_class;

public class StringLengthExample {

    public static void main(String[] args) {
        String ssn = "9201199929292";

        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민번호 자리수가 맞음");
            return;
        }
        System.out.println("주민번호 자리수가 안맞음");

    }

}

/*
    결과
        주민번호 자리수가 맞음
 */