package _11_multi_thread.synchronize_example;

public class User1 extends Thread {
    private Calculator calculator;


    public void setCalculator(Calculator calculator) {
        this.setName("User1");  // 스레드 이름 설정
        this.calculator = calculator;
    }

    public void run() {
        calculator.setMemory(100);
    }

}
