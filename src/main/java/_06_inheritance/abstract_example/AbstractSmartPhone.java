package _06_inheritance.abstract_example;

public class AbstractSmartPhone extends AbstractPhone {

    public AbstractSmartPhone(String owner) {
        super(owner);   // 추상 클래스는 super() 로 객체 생성 가능, 명시적으로 없으면 컴파일러가 기본 생성자 만듦
    }


    public void internetSearch() {
        System.out.println("인터넷 검색");
    }

}
