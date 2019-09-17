package _13_lambda_expressions.target_type_functional_interface;

public class MyFunctionalInterfaceExample01 {

    public static void main(String[] args) {
        MyFunctionalInterface01 fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {System.out.println("method call2");};
        fi.method();

        fi = () -> System.out.println("method call3");
        fi.method();
    }

}

/*
    결과
        method call1
        method call2
        method call3
 */