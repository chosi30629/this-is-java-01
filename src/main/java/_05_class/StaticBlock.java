package _05_class;

public class StaticBlock {
    static String company = "java";
    static String model = "intelliJ";
    static String info;


    static {
        info = company + "-" + model;
//        this.info 컴파일 에러(인스턴스 멤버 필드만 this 사용 가능, 객체의 자신을 this, static 은 클래스 필드)
    }

}
