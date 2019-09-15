package _10_basic_api_class.java_time_package;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {

    public static void main(String[] args) {
        DateTimeFormatter formatter;
        LocalDate localDate;

        localDate = LocalDate.parse("2024-05-21");  // parse 메소드는 기본적으로 ISO_LOCAL_DATE 포맷터를 사용해서 문자열 파싱
        System.out.println(localDate);

        formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        localDate = LocalDate.parse("2024-06-22", formatter);
        System.out.println(localDate);

        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        localDate = LocalDate.parse("2013/02/22", formatter);
        System.out.println(localDate);

        formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        localDate = LocalDate.parse("2024.09.22", formatter);
        System.out.println(localDate);

        LocalDateTime localDate1 =
                LocalDateTime.parse("2019-02-12 13:11:11", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(localDate1);
        System.out.println(localDate1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

}

/*
    결과
        2024-05-21
        2024-06-22
        2013-02-22
        2024-09-22
        2019-02-12T13:11:11
        2019-02-12 13:11:11
 */