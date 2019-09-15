package _10_basic_api_class.java_time_package;

import java.time.*;
import java.util.Locale;

public class DateTimeInfoExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String strDateTime = now.getYear() + "년 ";
        strDateTime += now.getMonthValue() + "월 ";
        strDateTime += now.getDayOfMonth() + "일 ";
        strDateTime += now.getDayOfWeek() + " ";
        strDateTime += now.getHour() + "시 ";
        strDateTime += now.getMinute() + "분 ";
        strDateTime += now.getSecond() + "초 ";
        strDateTime += now.getNano() + "나노초";
        System.out.println(strDateTime + "\n");

        LocalDate nowDate = now.toLocalDate();
        if (nowDate.isLeapYear()) {
            System.out.println("올해는 윤년: 2월은 29일까지 있습니다.\n");
        } else {
            System.out.println("올해는 평년: 2월은 28일까지 있습니다.\n");
        }

        // 협정 세계시와 존오프셋(시차)
        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("협정 세계시: " + utcDateTime);
        ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("서울 타임존: " + seoulDateTime);
        ZoneId seoulZoneId = seoulDateTime.getZone();
        System.out.println("서울 존아이디: " + seoulZoneId);
        ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
        System.out.println("서울 존오프셋: " + seoulZoneOffset + "\n");
    }

}

/*
    결과
        2019-09-15T16:44:20.417
        2019년 9월 15일 SUNDAY 16시 44분 20초 417000000나노초

        올해는 평년: 2월은 28일까지 있습니다.

        협정 세계시: 2019-09-15T07:44:20.419Z[UTC]
        서울 타임존: 2019-09-15T16:44:20.419+09:00[Asia/Seoul]
        서울 존아이디: Asia/Seoul
        서울 존오프셋: +09:00
 */