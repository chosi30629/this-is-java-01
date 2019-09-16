package _11_multi_thread.synchronize_example;

public class MainThreadExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }

}

/*
    동기화 메소드 아닐 때 결과
        User1: 50
        User2: 50

    동기화 메소드일 때 결과
        User1: 100  2초뒤
        User2: 50



 */