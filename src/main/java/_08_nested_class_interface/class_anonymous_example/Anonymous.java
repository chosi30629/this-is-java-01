package _08_nested_class_interface.class_anonymous_example;

public class Anonymous {
    // 필드 초기값으로 대입
    Person field = new Person() {
        // 익명 객체는 생성자가 없음

        void work() {
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어남");
            work(); // 익명 자식 객체 내부에서만 사용 가능
        }
    };

    void method1() {
        // 로컬 변수값으로 대입
        Person localVar = new Person() {
            void walk() {
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어남");
                walk(); // 익명 자식 객체 내부에서만 사용 가능
            }
        };
        // 로컬 변수 사용
        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }

}
