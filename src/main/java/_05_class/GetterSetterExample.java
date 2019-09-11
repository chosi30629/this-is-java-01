package _05_class;

public class GetterSetterExample {

    public static void main(String[] args) {
        GetterSetter getterSetter = new GetterSetter();

        getterSetter.setSpeed(-50);

        System.out.println("현재 속도: " + getterSetter.getSpeed());

        getterSetter.setSpeed(60);

        if (!getterSetter.isStop()) {
            getterSetter.setStop(true);
        }

        System.out.println("현재 속도: " + getterSetter.getSpeed());
    }

}

/*
    결과
        현재 속도: 0
        현재 속도: 0
 */