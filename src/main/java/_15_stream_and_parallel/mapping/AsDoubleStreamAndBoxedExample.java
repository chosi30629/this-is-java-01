package _15_stream_and_parallel.mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);
        intStream
            .asDoubleStream()   // DoubleStream 생성. int -> double
            .forEach(d -> System.out.println(d));

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream
            .boxed()    // Stream<Integer> 박싱
            .forEach(obj -> System.out.println(obj.intValue()));
    }

}

/*
    결과
        Java8에서 추가된 새로운 기능
        1. 람다식
        2. 메소드 참조
        3. 디폴드 메소드와 정적 메소드
        4. 새로운 API 패키지
 */