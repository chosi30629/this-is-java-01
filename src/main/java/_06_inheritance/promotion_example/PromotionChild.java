package _06_inheritance.promotion_example;

public class PromotionChild extends PromotionParent {

    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }

    public void method3() {
        System.out.println("Child-method3()");
    }

}
