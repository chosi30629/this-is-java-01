package _13_lambda_expressions.api_functional_interface;

import _12_generic.generic_method_example.Pair;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
    private static int[] scores = {92, 95, 87};


    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
            (a, b) -> {
                if (a >= b) {
                    return a;
                } else {
                    return b;
                }
            }
        );
        System.out.println("최대값: " + max);

        int min = maxOrMin(
            (a, b) -> {
                if (a <= b) {
                    return a;
                } else {
                    return b;
                }
            }
        );
        System.out.println("최소값: " + min);
    }

}

/*
    결과
        최대값: 95
        최소값: 87
 */