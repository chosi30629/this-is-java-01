package _11_multi_thread.synchronize_example;

public class Calculator {
    private int memory;


    public int getMemory() {
        return memory;
    }

//    public void setMemory(int memory) {
    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);

        /*
        // 동기화 블록 예제
        synchronized (this) {   // this 는 공유 객체인 Calculator 의 참조(잠금 대상)
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
        */
    }

}
