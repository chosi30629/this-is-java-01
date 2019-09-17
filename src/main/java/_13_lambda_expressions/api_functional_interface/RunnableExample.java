package _13_lambda_expressions.api_functional_interface;

public class RunnableExample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
    }

}

/*
    결과
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
 */