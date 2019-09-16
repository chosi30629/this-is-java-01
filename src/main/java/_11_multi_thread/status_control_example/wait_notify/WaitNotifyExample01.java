package _11_multi_thread.status_control_example.wait_notify;

public class WaitNotifyExample01 {

    public static void main(String[] args) {
        WorkObject shardObject = new WorkObject();

        ThreadA threadA = new ThreadA(shardObject);
        ThreadB threadB = new ThreadB(shardObject);

        threadA.start();
        threadB.start();
    }

}

/*
    결과
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
        ThreadA의 methodA() 작업 실행
        ThreadB의 methodB() 작업 실행
 */