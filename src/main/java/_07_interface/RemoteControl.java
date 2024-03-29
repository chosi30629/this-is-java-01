package _07_interface;

public interface RemoteControl {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;


    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리");
        } else {
            System.out.println("무음 해제");
        }
    }

    static void changeBattery() {
        System.out.println("배터리 교체");
    }

}
