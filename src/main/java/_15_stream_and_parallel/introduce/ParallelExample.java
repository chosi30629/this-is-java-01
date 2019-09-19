package _15_stream_and_parallel.introduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "김자바", "스프링", "리액트", "깃허브");

        // 순차 처리
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample :: print);   // s -> ParallelExample.print(s) 와 동일
        System.out.println();

        // 병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample :: print);
    }

    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }

}

/*
    결과
        홍길동 : main
        김자바 : main
        스프링 : main
        리액트 : main
        깃허브 : main

        스프링 : main
        리액트 : ForkJoinPool.commonPool-worker-2
        홍길동 : ForkJoinPool.commonPool-worker-2
        깃허브 : main
        김자바 : ForkJoinPool.commonPool-worker-9
 */