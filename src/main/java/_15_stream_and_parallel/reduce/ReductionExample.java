package _15_stream_and_parallel.reduce;

import java.util.Arrays;
import java.util.List;

// 커스텀 집계
public class ReductionExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
            new Student("홍길동", 92),
            new Student("알고리즘", 95),
            new Student("자료구조", 88)
        );

        int sum1 = studentList.stream()
            .mapToInt(Student :: getScore)
            .sum();

        // 스트림에 요소가 없을 경우 NoSuchElementException
        int sum2 = studentList.stream()
            .map(Student :: getScore)
            .reduce((a, b) -> a + b)
            .get();

        // 스트림에 요소가 없을 경우 디폴트 0
        int sum3 = studentList.stream()
            .map(Student :: getScore)
            .reduce(0, (a, b) -> a + b);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);
    }

}

/*
    결과
        sum1: 275
        sum2: 275
        sum3: 275
 */