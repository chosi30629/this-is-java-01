package _07_interface.instanceof_example;

public class VehicleExample {

    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle vehicle = new Bus();
        driver.drive(vehicle);
    }

}

/*
    결과
        승차요금을 체크합니다.
        버스가 달립니다.
 */