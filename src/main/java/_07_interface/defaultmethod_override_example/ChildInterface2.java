package _07_interface.defaultmethod_override_example;

public interface ChildInterface2 extends ParentInterface {
    @Override
    default void method2() {
        System.out.println("ChildInterface2-override-default-method2()");
    }
    public void method3();
}
