package _06_inheritance.abstract_example;

public class AnimalExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("-----");


        // 변수의 자동 타입 변환
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("-----");


        // 메소드 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    private static void animalSound(Animal animal) {
        animal.sound();
    }

}

/*
    결과
        멍멍
        야옹
        -----
        멍멍
        야옹
        -----
        멍멍
        야옹

 */