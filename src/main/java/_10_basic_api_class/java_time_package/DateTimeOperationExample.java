package _10_basic_api_class.java_time_package;

import java.time.LocalDateTime;

public class DateTimeOperationExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재시: " + now);

        LocalDateTime targetDateTime = now
            .plusYears(1)
            .minusMonths(2)
            .plusDays(3)
            .plusHours(4)
            .minusMinutes(5)
            .plusSeconds(6);
        System.out.println("연산후: " + targetDateTime);
    }

}

/*
    결과
        현재시: 2019-09-15T16:51:44.922
        연산후: 2020-07-18T20:46:50.922
 */