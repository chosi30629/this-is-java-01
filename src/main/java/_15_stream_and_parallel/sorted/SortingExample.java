package _15_stream_and_parallel.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[] {5, 4, 3, 2, 1});
        intStream
            .sorted()       // 오름차순. sorted((a, b) -> a.compareTo(b)) 이나 sorted(Comparator.naturalOrder()) 로 대체 가능
            .forEach(n -> System.out.print(n + ", "));
        System.out.println();

        List<Student> studentList = Arrays.asList(
            new Student("홍길동", 30),
            new Student("신자바", 10),
            new Student("유씨플", 20)
        );
        studentList.stream()
            .sorted()   // 점수를 기준으로 오름차순(Student 는 Comparable 구현)
            .forEach(s -> System.out.print(s.getScore() + ", "));
        System.out.println();

        studentList.stream()
            .sorted(Comparator.reverseOrder())  // 점수를 기준으로 내림차순. sorted((a, b) -> b.compareTo(a)) 로 대체 가능
            .forEach(s -> System.out.print(s.getScore() + ", "));
    }

}

/*
    결과
        1, 2, 3, 4, 5,
        10, 20, 30,
        30, 20, 10,
 */