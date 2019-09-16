package _11_multi_thread.daemon_thread_example;

public class AutoSaveThread extends Thread {

    public void save() {
        System.out.println("작업 내용을 저장함");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }

}
