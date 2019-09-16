package _11_multi_thread.status_example;

public class ThreadStateExample {

    public static void main(String[] args) {
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
        statePrintThread.start();
    }

}

/*
    결과
        타겟 스레드 상태: NEW
        타겟 스레드 상태: RUNNABLE
        타겟 스레드 상태: TIMED_WAITING
        타겟 스레드 상태: TIMED_WAITING
        타겟 스레드 상태: TIMED_WAITING
        타겟 스레드 상태: RUNNABLE
        타겟 스레드 상태: TERMINATED
 */