package _13_lambda_expressions.api_functional_interface.predicate_example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
        new Student("홍길동", "남자", 90),
        new Student("홍길순", "여자", 90),
        new Student("고슬링", "남자", 95),
        new Student("에이다", "여자", 92)
    );

    public static double avg(Predicate<Student> predicate) {
        int count = 0;
        int sum = 0;
        for (Student student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getGender().equals("남자"));
        System.out.println("남자 평균 점수: " + maleAvg);

        double femaleAvg = avg(t -> t.getGender().equals("여자"));
        System.out.println("여자 평균 점수: " + femaleAvg);
    }

}

/*
    결과
        남자 평균 점수: 92.5
        여자 평균 점수: 91.0
 */