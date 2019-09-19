package _15_stream_and_parallel.introduce;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
            new Student("김자바", 10),
            new Student("스칼라", 20),
            new Student("스프링", 30)
        );

        double avg = studentList.stream()
            // 중간 처리(학생 객체를 점수로 매핑)
            .mapToInt(Student :: getScore)
            // 최종 처리(평균 점수)
            .average()
            .getAsDouble();

        System.out.println("평균 점수: " + avg);
    }

}

/*
    결과
        평균 점수: 20.0
 */
