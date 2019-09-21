package _15_stream_and_parallel.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SequencialVsParallelExample {

    // 요소 처리
    public static void work(int value) {
        try {
            // 값이 작을수록 순차 처리가 빠름
            Thread.sleep(100);
        } catch (InterruptedException e) {}
    }

    // 순차 처리
    public static long testSequencial(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().forEach(a -> work(a));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }

    // 병렬 처리
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().parallel().forEach(a -> work(a));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }

    public static void main(String[] args) {
        // 소스 컬렉션
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        // 순차 스트림 처리 시간 구하기
        long timeSequencial = testSequencial(list);

        // 병렬 스트림 처리 시간 구하기
        long timeParallel = testParallel(list);

        System.out.println(timeSequencial);
        System.out.println(timeParallel);
    }

}

/*
    내 운영체제에서는 sleep 값이 작아도 병렬이 더 빠름
    결과
        1076031812
        108678076
 */