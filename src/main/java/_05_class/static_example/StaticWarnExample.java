package _05_class.static_example;

public class StaticWarnExample {
    int speed;
    static int maxSpeed;


    static {
//        speed = 10; 컴파일 에러
//        run(); 컴파일 에러
        maxSpeed = 70;
        runs();
    }

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void runs() {
//        speed = 10; 컴파일 에러
//        run(); 컴파일 에러
        System.out.println(maxSpeed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        StaticWarnExample staticWarnExample = new StaticWarnExample();
        staticWarnExample.speed = 60;
        staticWarnExample.run();
    }

}

/*
    static 은 static
    인스턴스 멤버를 사용하고 싶다면 객체 생성

    결과
        70으로 달립니다.
        60으로 달립니다.
 */