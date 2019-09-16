package _11_multi_thread.group_example;

import _11_multi_thread.daemon_thread_example.AutoSaveThread;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();  // 프로세스에서 실행하는 모든 Thread 가져오기
        Set<Thread> threads = map.keySet();
        for (Thread thread : threads) {
            System.out.println("Name: " + thread.getName() + ((thread.isDaemon() ? "(데몬)" : "(주)")));
            System.out.println("\t소속그룹: " + thread.getThreadGroup().getName());
            System.out.println();
        }
    }

}

/*
    결과
        Name: AutoSaveThread(데몬)
            소속그룹: main

        Name: Reference Handler(데몬)
            소속그룹: system

        Name: Monitor Ctrl-Break(데몬)
            소속그룹: main

        Name: Signal Dispatcher(데몬)
            소속그룹: system

        Name: Finalizer(데몬)
            소속그룹: system

        Name: main(주)
            소속그룹: main
 */