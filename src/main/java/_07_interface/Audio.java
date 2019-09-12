package _07_interface;

public class Audio implements RemoteControl {
    private boolean mute;


    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolume(int volume) {

    }

    // 디폴트 메소드 재정의 가능
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            System.out.println("Audio 무음 처리");
        } else {
            System.out.println("Audio 무음 해제");
        }
    }

}
