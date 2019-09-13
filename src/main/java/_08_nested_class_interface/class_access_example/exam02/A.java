package _08_nested_class_interface.class_access_example.exam02;

public class A {
    int field1;
    void method1() {}

    static int field2;
    static void method2() {}

    class B {
        /*
        불가능

        field1 = 10;
        method1();

        A.field2 = 10;
        A.method2();

        A a = new A();
        a.field1 = 10;
        a.method1();
        */

        void method() {
            // 인스턴스 멤버 클래스의 메소드에서 바깥 클래스의 모든 필드와 메소드에 접근 가능
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C {
       /*
        불가능

        field1 = 10;
        method1();

        A.field2 = 10;
        A.method2();

        A a = new A();
        a.field1 = 10;
        a.method1();
        */

       void method() {
           // 정적 멤버 클래스의 메소드에서 바깥 클래스의 인스턴스 필드와 메소드는 접근할 수 없음
//           field1 = 10;
//           method1();

           field2 = 10;
           method2();
       }
    }

}
