package _07_interface.expression;

public interface DefaultMethod {

    // public 특성을 갖는다. 생략 가능. 인터페이스에 선언된 인스턴스 메소드이기 때문에 구현 객체가 있어야 사용할 수 있다.
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리");
        } else {
            System.out.println("무음 해제");
        }
    }

}
