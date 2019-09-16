package _11_multi_thread.status_control_example.stopflag_interrupt;

// 실행중인 스레드 안전종료(stop flag 활용)
public class StopFlagExample {

    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        printThread1.setStop(true);

    }

}

/*
    결과
        무한반복 실행 중 출력
        1초 후
        자원 정리
        실행 종료
 */