package _07_interface.defaultmethod_override_example;

public interface ParentInterface {
    public void method1();
    public default void method2() {
        System.out.println("ParentInterface1-default-method2()");
    }
}
