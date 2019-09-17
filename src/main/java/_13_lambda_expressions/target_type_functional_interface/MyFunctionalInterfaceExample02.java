package _13_lambda_expressions.target_type_functional_interface;

public class MyFunctionalInterfaceExample02 {

    public static void main(String[] args) {
        MyFunctionalInterface02 fi;

        fi = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);

        fi = x -> {System.out.println(x * 5);};
        fi.method(2);

        fi = x -> System.out.println(x * 5);
        fi.method(2);
    }

}

/*
    결과
        10
        10
        10
 */
