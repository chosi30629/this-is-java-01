package _06_inheritance;

public class DmbCellPhone extends CellPhone {
    int channel;


    DmbCellPhone(String model, String color, int channel) {
//        super();    명시적으로 선언되지 않았다면 컴파일러가 자동으로 부모 기본 생성자 생성
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb() {
        powerOn();
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작");
        powerOff();
    }

}
