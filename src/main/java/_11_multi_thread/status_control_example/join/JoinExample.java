package _11_multi_thread.status_control_example.join;

public class JoinExample {

    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            // sumThread 가 종료할 때까지 메인 스레드를 일시 정지 시킴
            sumThread.join();
        } catch (InterruptedException e) {

        }

        System.out.println("1 ~ 100 합 : " + sumThread.getSum());
    }

}

/*
    결과
        1 ~ 100 합 : 5050
 */