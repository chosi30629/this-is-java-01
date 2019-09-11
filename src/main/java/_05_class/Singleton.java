package _05_class;

public class Singleton {
    private static Singleton singleton = new Singleton();


    private Singleton() {

    }


    static Singleton getInstance() {
        return singleton;
    }

}
