package _10_basic_api_class.string_class;

public class StringSubstringExample {

    public static void main(String[] args) {
        String ssn = "889988-1230222";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }

}

/*
    결과
        889988
        1230222
 */