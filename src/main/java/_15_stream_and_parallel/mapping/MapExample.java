package _15_stream_and_parallel.mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
            new Student("홍길동", 10),
            new Student("김자바", 20),
            new Student("스칼라", 30)
        );

        studentList.stream()
            .mapToInt(Student :: getScore)
            .forEach(score -> System.out.println(score));
    }

}

/*
    결과
        10
        20
        30
 */