package _13_lambda_expressions.api_functional_interface.function_example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {

    private static List<Student> list = Arrays.asList(
        new Student("홍길동", 90, 96),
        new Student("조성일", 95, 97)
    );

    public static void printString(Function<Student, String> function) {
        for (Student student : list) {
            System.out.print(function.apply(student) + " ");
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function) {
        for (Student student : list) {
            System.out.print(function.applyAsInt(student) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("[학생 이름]");
        printString(t -> t.getName());

        System.out.println("[영어 점수]");
        printInt(t -> t.getEnglishScore());

        System.out.println("[수학 점수]");
        printInt(t -> t.getMathScore());
    }

}

/*
    결과
        [학생 이름]
        홍길동 조성일
        [영어 점수]
        90 95
        [수학 점수]
        96 97
 */