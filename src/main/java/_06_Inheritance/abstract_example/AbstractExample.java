package _06_Inheritance.abstract_example;

public class AbstractExample {

    public static void main(String[] args) {
//        AbstractPhone phone = new AbstractPhone(""); 추상 클래스는 생성자를 호출해서 객체 생성할 수 없음

        AbstractSmartPhone abstractSmartPhone = new AbstractSmartPhone("성일");

        abstractSmartPhone.turnOn();
        abstractSmartPhone.internetSearch();
        abstractSmartPhone.turnOff();
    }

}

/*
    결과
        전원 킴
        인터넷 검색
        전원 끔
 */