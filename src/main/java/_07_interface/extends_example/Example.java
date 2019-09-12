package _07_interface.extends_example;

public class Example {

    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA();   // methodA 만 호출 가능
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();   // methodB 만 호출 가능
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }

}

/*
    결과
        ImplementationC-methodA() 실행

        ImplementationC-methodB() 실행

        ImplementationC-methodA() 실행
        ImplementationC-methodB() 실행
        ImplementationC-methodC() 실행
 */