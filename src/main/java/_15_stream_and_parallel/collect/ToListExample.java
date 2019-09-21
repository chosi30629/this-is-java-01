package _15_stream_and_parallel.collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
            new Student("홍길동", 10, Student.Gender.MAIL),
            new Student("스칼라", 6, Student.Gender.FEMAIL),
            new Student("조자바", 10, Student.Gender.MAIL),
            new Student("에이다", 6, Student.Gender.FEMAIL)
        );

        // 남학생들만 묶어 List 생성
        List<Student> maleList = totalList.stream()
            .filter(s -> s.getGender() == Student.Gender.MAIL)
            .collect(Collectors.toList());
        maleList.stream().forEach(s -> System.out.println(s.getName()));

        System.out.println();

        // 여학생들만 묶어 HashSet 생성
        Set<Student> femaleSet = totalList.stream()
            .filter(s -> s.getGender() == Student.Gender.FEMAIL)
            .collect(Collectors.toCollection(HashSet :: new));
//            .collect(Collectors.toSet());

        femaleSet.stream()
            .forEach(s -> System.out.println(s.getName()));

    }

}
