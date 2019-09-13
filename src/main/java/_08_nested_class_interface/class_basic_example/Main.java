package _08_nested_class_interface.class_basic_example;

public class Main {

    public static void main(String[] args) {
        A a = new A();

        // 인스턴스 멤버 클래스 객체 생성
        A.B b = a.new B();
        b.field1 = 3;
        b.method1();

        // 정적 멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;
        A.C.method2();

        // 로컬 클래스 객체 생성을 위한 메소드 호출
        a.method();
    }

}

/*
    결과
        A 객체 생성 - 바깥 클래스
        B 객체 생성 - 인스턴스 멤버 클래스
        C 객체 생성 - 정적 멤버 클래스
        D 객체 생성 - 로컬 클래스
 */