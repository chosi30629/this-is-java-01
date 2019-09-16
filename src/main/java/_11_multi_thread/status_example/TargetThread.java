package _11_multi_thread.status_example;

public class TargetThread extends Thread {

    public void run() {
        for (long i = 0; i < 2100000000; i++) { // RUNNABLE

        }

        try {
            Thread.sleep(1500);         // TIMED_WAITING
        } catch (Exception e) {

        }

        for (long i = 0; i < 2100000000; i++) { // RUNNABLE

        }
    }

}
