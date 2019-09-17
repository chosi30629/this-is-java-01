package _13_lambda_expressions.method_references_example;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

    public static void main(String[] args) {
        IntBinaryOperator operator;

        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과1 : " + operator.applyAsInt(1, 2));

        operator = Calculator :: staticMethod;
        System.out.println("결과2 : " + operator.applyAsInt(3, 4));

        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과3 : " + operator.applyAsInt(5, 6));

        operator = obj :: instanceMethod;
        System.out.println("결과4 : " + operator.applyAsInt(7, 8));
    }

}

/*
    결과
        결과1 : 3
        결과2 : 7
        결과3 : 11
        결과4 : 15
 */