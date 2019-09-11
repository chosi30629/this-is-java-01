package _05_class;

public class ThisCar {
    String company = "자바자동차";
    String model;
    String color;
    int maxSpeed;


    ThisCar() {

    }

    ThisCar(String model) {
        this(model, "은색", 250);
    }

    ThisCar(String model, String color) {
        this(model, color, 300);
    }

    ThisCar(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
