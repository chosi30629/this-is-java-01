package _11_multi_thread.status_control_example.stopflag_interrupt;

public class PrintThread2 extends Thread {

    public void run() {
//        try {
            while (true) {
                System.out.println("실행 중");
                // 방법 1. 짧은 시간이나마 일시 정지시키기, interrupt() 메소드가 실행되면 즉시 예외가 발생하지 않고, 스레드가 미래에 일시 정지 상태가 되면 예외
                // Thread.sleep(1);
                // 방법 2. interrupt() 가 호출되었는지 확인, try 문 제거
                if (Thread.interrupted()) {
                    break;
                }
            }
//        } catch (InterruptedException e) {
//
//        }

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }

}
