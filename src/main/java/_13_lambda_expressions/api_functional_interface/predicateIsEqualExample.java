package _13_lambda_expressions.api_functional_interface;

import java.util.function.Predicate;

public class predicateIsEqualExample {

    public static void main(String[] args) {
        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println("null, null: " + predicate.test(null));

        predicate = Predicate.isEqual("Java8");
        System.out.println("null, Java8: " + predicate.test(null));

        predicate = Predicate.isEqual(null);
        System.out.println("Java8, null: " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java8");
        System.out.println("Java8, Java8: " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java8");
        System.out.println("Java7, Java8: " + predicate.test("Java7"));
    }

}

/*
    결과
        null, null: true
        null, Java8: false
        Java8, null: false
        Java8, Java8: true
        Java7, Java8: false
 */
