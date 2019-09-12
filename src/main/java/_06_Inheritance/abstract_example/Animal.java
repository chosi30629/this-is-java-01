package _06_Inheritance.abstract_example;

public abstract class Animal {
    public String kind;


    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();

}
