package _07_interface.defaultmethod_override_example;

public class Example {

    public static void main(String[] args) {
        ChildInterface1 ci1 = new ChildInterface1() {
            @Override
            public void method1() {
                System.out.println("ChildInterface1-method1()");
            }

            @Override
            public void method3() {
                System.out.println("ChildInterface1-method3()");
            }
        };
        ci1.method1();
        ci1.method2();
        ci1.method3();

        System.out.println();

        ChildInterface2 ci2 = new ChildInterface2() {
            @Override
            public void method1() {
                System.out.println("ChildInterface2-method1()");
            }

            @Override
            public void method3() {
                System.out.println("ChildInterface2-method3()");
            }
        };
        ci2.method1();
        ci2.method2();
        ci2.method3();

        System.out.println();

        ChildInterface3 ci3 = new ChildInterface3() {
            @Override
            public void method1() {
                System.out.println("ChildInterface3-method1()");
            }

            @Override
            public void method2() {
                System.out.println("ChildInterface3-override-abstract-method2()");
            }

            @Override
            public void method3() {
                System.out.println("ChildInterface3-method3()");
            }
        };
        ci3.method1();
        ci3.method2();
        ci3.method3();
    }

}

/*
    결과
        ChildInterface1-method1()
        ParentInterface1-default-method2()
        ChildInterface1-method3()

        ChildInterface2-method1()
        ChildInterface2-override-default-method2()
        ChildInterface2-method3()

        ChildInterface3-method1()
        ChildInterface3-override-abstract-method2()
        ChildInterface3-method3()
 */