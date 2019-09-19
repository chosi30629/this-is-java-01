package _15_stream_and_parallel.introduce;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "조성일", "김자바");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println();

        Stream<String> stringStream = list.stream();
        stringStream.forEach(name -> System.out.println(name));
    }

}

/*
    결과
        홍길동
        조성일
        김자바

        홍길동
        조성일
        김자바
 */