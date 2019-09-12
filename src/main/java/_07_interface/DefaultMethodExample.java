package _07_interface;

public class DefaultMethodExample {

    public static void main(String[] args) {
//        RemoteControl.setMute(); 구현 객체가 있어야 default method 호출 가능
        RemoteControl remoteControl = new Audio();
        remoteControl.setMute(true);
    }

}

/*
    결과
        Audio 무음 처리
 */