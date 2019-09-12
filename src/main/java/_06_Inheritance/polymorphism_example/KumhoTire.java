package _06_Inheritance.polymorphism_example;

public class KumhoTire extends Tire {

    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }


    @Override
    public boolean roll() {
        ++accumulatedRotation;

        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        }

        System.out.println("*** " + location + " KumhoTire 펑크 ***");
        return false;
    }

}
