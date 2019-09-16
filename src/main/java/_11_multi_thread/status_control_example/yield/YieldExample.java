package _11_multi_thread.status_control_example.yield;

public class YieldExample {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        threadA.work = false;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        threadA.work = true;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        threadA.stop = true;
        threadB.stop = true;
    }

}

/*
    결과
        같이 작업
        3초 후 A양보 B만 작업
        3초 후 같이 작업
        3초 후 같이 종료
 */