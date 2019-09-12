package _06_inheritance.casting_example;

public class CastingExample {

    public static void main(String[] args) {
        CastingParent castingParent = new CastingChild();   // 자동 타입 변환
        castingParent.field1 = "data1";
        castingParent.method1();
        castingParent.method2();

        /*  불가능
        castingParent.field2 = "data2";
        castingParent.method3();
        */

        CastingChild castingChild = (CastingChild) castingParent;   // 강제 타입 변환
        castingChild.field2 = "data2";
        castingChild.method3();
    }

}

/*
    결과
        Parent-method1()
        Parent-method2()
        Child-method3()
 */