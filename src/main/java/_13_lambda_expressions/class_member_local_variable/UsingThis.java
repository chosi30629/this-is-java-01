package _13_lambda_expressions.class_member_local_variable;

public class UsingThis {
    public int outerField = 10;


    class Inner {
        int innerFiled = 20;

        void method() {
            MyFunctionalInterface01 fi = () -> {
                System.out.println("outerField: " + outerField);
                // 바깥 객체의 참조를 얻기 위해서는 클래스명.this 를 사용
                System.out.println("outerField: " + UsingThis.this.outerField + "\n");

                System.out.println("innerField: " + innerFiled);
                // 람다식 내부에서 this 는 Inner 객체를 참조(익명 객체의 참조가 아니라 람다식을 실행한 객체의 참조)
                System.out.println("innerField: " + this.innerFiled + "\n");
            };
            fi.method();
        }
    }


}
