package _15_stream_and_parallel.parallel;

import _15_stream_and_parallel.collect.MaleStudent;
import _15_stream_and_parallel.collect.Student;

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

        _15_stream_and_parallel.collect.MaleStudent maleStudent = totalList.parallelStream()
                .filter(s -> s.getGender() == Student.Gender.MAIL)
                .collect(_15_stream_and_parallel.collect.MaleStudent:: new, _15_stream_and_parallel.collect.MaleStudent:: accumulate, MaleStudent:: combine);

        maleStudent.getList().stream()
                .forEach(s -> System.out.println(s.getName()));
    }

}

/*
    결과
        [ForkJoinPool.commonPool-worker-9] MaleStudent()
        [ForkJoinPool.commonPool-worker-11] MaleStudent()
        [ForkJoinPool.commonPool-worker-2] MaleStudent()
        [main] MaleStudent()
        [main] accumulate()
        [ForkJoinPool.commonPool-worker-2] accumulate()
        [main] combine()
        [ForkJoinPool.commonPool-worker-2] combine()
        [ForkJoinPool.commonPool-worker-2] combine()
        홍길동
        조자바
 */