package _06_Inheritance;

public class FinalMethod {
    public int speed;


    public void speedUp() {
        speed += 1;
    }

    // final 로 인해 자식클래스에서 재정의할 수 없는 메소드가 된다.
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }


}
