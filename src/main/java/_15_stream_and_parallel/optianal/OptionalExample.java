package _15_stream_and_parallel.optianal;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /*
        NoSuchElementException 예외 발생
        double avg = list.stream()
            .mapToInt(Integer :: intValue)
            .average()
            .getAsDouble();
        */

        // 방법 1
        OptionalDouble optional = list.stream()
            .mapToInt(Integer :: intValue)
            .average();
        if (optional.isPresent()) {
            System.out.println("방법1_평균: " + optional.getAsDouble());
        } else {
            System.out.println("방법1_평균: " + 0.0);
        }

        // 방법 2
        double avg = list.stream()
            .mapToInt(Integer :: intValue)
            .average()
            .orElse(0.0);
        System.out.println("방법2_평균: " + avg);

        // 방법 3
        list.stream()
            .mapToInt(Integer :: intValue)
            .average()
            .ifPresent(a -> System.out.println("방법3_평균: " + a));
    }

}

/*
    결과
        방법1_평균: 0.0
        방법2_평균: 0.0
 */