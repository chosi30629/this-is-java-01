package _08_nested_class_interface.class_basic_example;

public class A {

    A() {
        System.out.println("A 객체 생성 - 바깥 클래스");
    }


    class B {
        B() {
            System.out.println("B 객체 생성 - 인스턴스 멤버 클래스");
        }

        int field1;
//        static int field2;  정적 필드와 메소드 선언 불가
        void method1() {}
//        static void method2() {}    정적 필드와 메소드 선언 불가
    }


    static class C {
        C() {
            System.out.println("C 객체 생성 - 정적 멤버 클래스");
        }

        int field1;
        static int field2;
        void method1() {}
        static void method2() {}
    }


    void method() {
        class D {
            D() {
                System.out.println("D 객체 생성 - 로컬 클래스");
            }

            int field1;
//        static int field2;  정적 필드와 메소드 선언 불가
            void method1() {}
//        static void method2() {}    정적 필드와 메소드 선언 불가
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }

}
