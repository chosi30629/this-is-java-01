package _10_basic_api_class.java_time_package;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재: " + now);

        LocalDateTime targetDateTime = null;

        // 직접 변경
        targetDateTime = now
            .withYear(2024)
            .withMonth(10)
            .withDayOfMonth(5)
            .withHour(13)
            .withMinute(30)
            .withSecond(20);
        System.out.println("직접 변겅: " + targetDateTime);

        // 년도 상대 변경
        targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("이번 해의 첫 일: " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("이번 해의 마지막 일: " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("다음 해의 첫 일: " + targetDateTime);

        // 월 상대 변경
        targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("이번 달의 첫 일: " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("이번 달의 마지막 일: " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("다음 달의 첫 일: " + targetDateTime);

        // 요일 상대 변경
        targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("이번 달의 첫 월요일: " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("돌아오는 월요일: " + targetDateTime);
        targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println("지난 월요일: " + targetDateTime);
    }

}

/*
    결과
        현재: 2019-09-15T17:01:17.996
        직접 변겅: 2024-10-05T13:30:20.996
        이번 해의 첫 일: 2019-01-01T17:01:17.996
        이번 해의 마지막 일: 2019-12-31T17:01:17.996
        다음 해의 첫 일: 2020-01-01T17:01:17.996
        이번 달의 첫 일: 2019-09-01T17:01:17.996
        이번 달의 마지막 일: 2019-09-30T17:01:17.996
        다음 달의 첫 일: 2019-10-01T17:01:17.996
        이번 달의 첫 월요일: 2019-09-02T17:01:17.996
        돌아오는 월요일: 2019-09-16T17:01:17.996
        지난 월요일: 2019-09-09T17:01:17.996
 */