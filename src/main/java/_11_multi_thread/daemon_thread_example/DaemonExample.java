package _11_multi_thread.daemon_thread_example;

public class DaemonExample {

    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // AutoSaveThread 를 데몬 스레드로 만듦
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        System.out.println("메인 스레드 종료");
    }

}

/*
    결과
        작업 내용을 저장함
        작업 내용을 저장함
        메인 스레드 종료
 */