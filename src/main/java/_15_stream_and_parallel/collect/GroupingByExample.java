package _15_stream_and_parallel.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
            new Student("홍길동", 10, Student.Gender.MAIL, Student.City.SEOUL),
            new Student("스칼라", 6, Student.Gender.FEMAIL, Student.City.PUSAN),
            new Student("조자바", 10, Student.Gender.MAIL, Student.City.PUSAN),
            new Student("에이다", 6, Student.Gender.FEMAIL, Student.City.SEOUL)
        );

        Map<Student.Gender, List<Student>> mapByGender = totalList.stream()
            .collect(Collectors.groupingBy(Student :: getGender));

        System.out.print("[남학생] ");
        mapByGender.get(Student.Gender.MAIL).stream()
            .forEach(s -> System.out.print(s.getName() + " "));

        System.out.print("\n[여학생] ");
        mapByGender.get(Student.Gender.FEMAIL).stream()
            .forEach(s -> System.out.print(s.getName() + " "));

        System.out.println();

        Map<Student.City, List<String>> mapByCity = totalList.stream()
            .collect(
                Collectors.groupingBy(
                    Student :: getCity,
                    Collectors.mapping(Student :: getName, Collectors.toList())
                )
            );

        System.out.print("\n[서울] ");
        mapByCity.get(Student.City.SEOUL).stream()
            .forEach(s -> System.out.print(s + " "));

        System.out.print("\n[부산] ");
        mapByCity.get(Student.City.PUSAN).stream()
            .forEach(s -> System.out.print(s + " "));
    }

}

/*
    결과
        [남학생] 홍길동 조자바
        [여학생] 스칼라 에이다

        [서울] 홍길동 에이다
        [부산] 스칼라 조자바
 */