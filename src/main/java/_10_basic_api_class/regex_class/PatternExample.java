package _10_basic_api_class.regex_class;

import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-0202";
        boolean result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식과 일치하지 않음");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@navercom";
        result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식과 일치하지 않음");
        }
    }

}

/*
    결과
        정규식과 일치
        정규식과 일치하지 않음
 */