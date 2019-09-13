package _08_nested_class_interface.interface_anonymous_example;

public class AnonymousExample {

    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        anonymous.field.turnOn();

        anonymous.method1();

        anonymous.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("SmartTV를 끕니다");
            }
        });
    }

}

/*
    결과
        TV를 켭니다.
        Audio를 켭니다.
        SmartTV를 켭니다.
 */