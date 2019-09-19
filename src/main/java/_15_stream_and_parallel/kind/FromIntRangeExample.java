package _15_stream_and_parallel.kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    private static int sum;


    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum += a);
        System.out.println("총합: " + sum);

        sum = 0;

        stream = IntStream.range(1, 100);
        stream.forEach(a -> sum += a);
        System.out.println("총합: " + sum);
    }

}

/*
    결과
        총합: 5050
        ₩총합: 4950
 */