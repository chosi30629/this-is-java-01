package _06_inheritance.polymorphism_example;

public class HankookTire extends Tire {

    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }


    @Override
    public boolean roll() {
        ++accumulatedRotation;

        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        }

        System.out.println("*** " + location + " HankookTire 펑크 ***");
        return false;
    }

}
