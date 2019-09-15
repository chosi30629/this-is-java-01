package _10_basic_api_class.java_time_package;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

    public static void main(String[] args) {
        LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
        System.out.println("시작일: " + startDateTime);

        LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
        System.out.println("종료일: " + endDateTime);

        if (startDateTime.isBefore(endDateTime)) {
            System.out.println("진행 중입니다.\n");
        } else if (startDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다.\n");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("종료했습니다.\n");
        }

        System.out.println("[종료까지 남은 시간]");
        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
        System.out.println("남은 해: " + remainYear);
        System.out.println("남은 달: " + remainMonth);
        System.out.println("남은 일: " + remainDay);
        System.out.println("남은 시간: " + remainHour);
        System.out.println("남은 분: " + remainMinute);
        System.out.println("남은 초: " + remainSecond);

        remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
        remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
        remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
        remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
        remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
        remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
        System.out.println("남은 해: " + remainYear);
        System.out.println("남은 달: " + remainMonth);
        System.out.println("남은 일: " + remainDay);
        System.out.println("남은 시간: " + remainHour);
        System.out.println("남은 분: " + remainMinute);
        System.out.println("남은 초: " + remainSecond);

        /*
        startDateTime 부터 endDateTime 까지의 날짜들
        for (int i = 0; i <= remainDay; i++) {
            System.out.println(startDateTime.plusDays(i));
        }
         */

        System.out.println("\n[종료까지 남은 기간]");
        Period period =
                Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
        System.out.print("남은 기간: " + period.getYears() + "년 ");
        System.out.print(period.getMonths() + "달 ");
        System.out.println(period.getDays() + "일\n");

        Duration duration =
                Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
        System.out.println("남은 초: " + duration.getSeconds());
    }

}

/*
    시작일: 2023-01-01T09:00
    종료일: 2024-03-31T18:00
    진행 중입니다.

    [종료까지 남은 시간]
    남은 해: 1
    남은 달: 14
    남은 일: 455
    남은 시간: 10929
    남은 분: 655740
    남은 초: 39344400
    남은 해: 1
    남은 달: 14
    남은 일: 455
    남은 시간: 10929
    남은 분: 655740
    남은 초: 39344400

    [종료까지 남은 기간]
    남은 기간: 1년 2달 30일

    남은 초: 32400
 */