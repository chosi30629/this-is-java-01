package _10_basic_api_class.java_time_package;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter =
            DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
//            DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분", Locale.KOREA);  AM / PM 한글
        String nowString = now.format(dateTimeFormatter);
        System.out.println(nowString);
    }

}

/*
    결과
        2019년 9월 15일 PM 6시 3분
 */