package _07_interface.expression;

public interface Constant {
    /*
        인터페이스 멤버 접근 제한자는 무조건 public
        인터페이스 상수는 static 블록으로 초기화 할 수 없다.
        상수는 public static final 이지만 인터페이스에서는 명시적으로 적지 않으면 자동으로 컴파일 과정에서 붙게 됨
     */
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;
}
