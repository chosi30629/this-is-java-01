package _15_stream_and_parallel.collect;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {

    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
            new Student("홍길동", 10, Student.Gender.MAIL),
            new Student("스칼라", 6, Student.Gender.FEMAIL),
            new Student("조자바", 10, Student.Gender.MAIL),
            new Student("에이다", 6, Student.Gender.FEMAIL)
        );

        MaleStudent maleStudent = totalList.stream()
            .filter(s -> s.getGender() == Student.Gender.MAIL)
            .collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);

        maleStudent.getList().stream()
            .forEach(s -> System.out.println(s.getName()));
    }

}

/*
    결과
        [main] MaleStudent()
        [main] accumulate()
        [main] accumulate()
        홍길동
        조자바
 */