package _06_Inheritance.abstract_example;

public abstract class AbstractPhone {
    public String owner;


    public AbstractPhone(String owner) {
        this.owner = owner;
    }


    public void turnOn() {
        System.out.println("전원 킴");
    }

    public void turnOff() {
        System.out.println("전원 끔");
    }

}
