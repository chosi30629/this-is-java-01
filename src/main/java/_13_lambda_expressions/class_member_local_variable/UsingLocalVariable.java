package _13_lambda_expressions.class_member_local_variable;

public class UsingLocalVariable {

    void method(int arg) {  // arg 는 final 특성을 가짐
        int localVar = 40;

//        arg = 31;   final 특성 때문에 수정 불가
//        localVar = 41;  final 특성 때문에 수정 불가

        MyFunctionalInterface01 fi = () -> {
            // 로컬 변수 읽기
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar + "\n");
        };
        fi.method();
    }

}
