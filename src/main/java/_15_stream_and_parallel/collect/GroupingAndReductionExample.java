package _15_stream_and_parallel.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
            new Student("홍길동", 10, Student.Gender.MAIL),
            new Student("스칼라", 6, Student.Gender.FEMAIL),
            new Student("조자바", 10, Student.Gender.MAIL),
            new Student("에이다", 6, Student.Gender.FEMAIL)
        );

        // 성병로 평균 점수를 저장하는 Map 얻기
        Map<Student.Gender, Double> mapByGender = totalList.stream()
            .collect(
                Collectors.groupingBy(
                    Student :: getGender,
                    Collectors.averagingDouble(Student :: getScore)
                )
            );

        System.out.println("남학생 평균 점수: " + mapByGender.get(Student.Gender.MAIL));
        System.out.println("여학생 평균 점수: " + mapByGender.get(Student.Gender.FEMAIL));

        // 성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
        Map<Student.Gender, String> mapByName = totalList.stream()
            .collect(
                Collectors.groupingBy(
                    Student :: getGender,
                    Collectors.mapping(
                        Student :: getName,
                        Collectors.joining(",")
                    )
                )
            );

        System.out.println("남학생 전체 이름: " + mapByName.get(Student.Gender.MAIL));
        System.out.println("여학생 전체 이름: " + mapByName.get(Student.Gender.FEMAIL));
    }

}

/*
    결과
        남학생 평균 점수: 10.0
        여학생 평균 점수: 6.0
        남학생 전체 이름: 홍길동,조자바
        여학생 전체 이름: 스칼라,에이다
 */