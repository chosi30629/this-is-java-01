package _13_lambda_expressions.class_member_local_variable;

public class UsingThisExample {

    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }

}

/*
    결과
        outerField: 10
        outerField: 10

        innerField: 20
        innerField: 20
 */