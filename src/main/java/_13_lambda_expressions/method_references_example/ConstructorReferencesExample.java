package _13_lambda_expressions.method_references_example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

    public static void main(String[] args) {
        Function<String, Member> function1 = Member :: new;
        Member member1 = function1.apply("angel");

        BiFunction<String, String, Member> function2 = Member :: new;
        Member member = function2.apply("신천사", "angel");
    }

}

/*
    결과
        Member(String id) 실행
        Member(String name, String id) 실행
 */