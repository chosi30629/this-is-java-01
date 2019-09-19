package _15_stream_and_parallel.kind;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {

    public static void main(String[] args) {
        String[] strArrays = {"홍길동", "김자바", "테스트"};
        Stream<String> strStream = Arrays.stream(strArrays);
        strStream.forEach(a -> System.out.print(a + ", "));

        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a -> System.out.print(a + ", "));
    }

}

/*
    결과
        홍길동, 김자바, 테스트,
        1, 2, 3, 4, 5,
 */
