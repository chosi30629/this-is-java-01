package _07_interface;

public class AnonymousObjectExample {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl() {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }

            @Override
            public void setVolume(int volume) {

            }
        };
    }

}
