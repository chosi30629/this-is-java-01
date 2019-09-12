package _06_inheritance.instanceof_example;

public class InstanceOfExample {

    public static void method1(InstanceOfParent instanceOfParent) {
        if (instanceOfParent instanceof InstanceOfChild) {
            InstanceOfChild instanceOfChild = (InstanceOfChild) instanceOfParent;
            System.out.println("method1 - Child 로 변환 성공");
            return;
        }
        System.out.println("method1 - Child 로 변환되지 않음");
    }

    public static void method2(InstanceOfParent instanceOfParent) {
        InstanceOfChild instanceOfChild = (InstanceOfChild) instanceOfParent;   // ClassCastException 발생 가능성 있음
        System.out.println("method2 - Child 로 변환 성공");
    }


    public static void main(String[] args) {
        InstanceOfParent instanceOfParentA = new InstanceOfChild();
        method1(instanceOfParentA);
        method2(instanceOfParentA);

        InstanceOfParent instanceOfParentB = new InstanceOfParent();
        method1(instanceOfParentB);
        method2(instanceOfParentB);
    }

}

/*
    결과
        method1 - Child 로 변환 성공
        method2 - Child 로 변환 성공
        method1 - Child 로 변환되지 않음
        Exception in thread "main" java.lang.ClassCastException
 */