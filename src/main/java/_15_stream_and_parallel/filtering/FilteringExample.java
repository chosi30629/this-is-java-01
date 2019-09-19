package _15_stream_and_parallel.filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "신씨플", "감자바", "신씨플", "신배열");

        names.stream()
            .distinct() // 중복 제거
            .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
            .filter(n -> n.startsWith("신")) // true 인 것만
            .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
            .distinct()
            .filter(n -> n.startsWith("신"))
            .forEach(n -> System.out.println(n));
    }

}

/*
    결과
        홍길동
        신씨플
        감자바
        신배열

        신씨플
        신씨플
        신배열

        신씨플
        신배열
 */