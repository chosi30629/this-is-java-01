package _05_class;

public class ThisCarExample {

    public static void main(String[] args) {
        ThisCar car1 = new ThisCar();
        System.out.println("car1.company : " + car1.company);
        System.out.println("car1.model : " + car1.model);
        System.out.println("car1.color : " + car1.color);
        System.out.println("car1.maxSpeed : " + car1.maxSpeed);
        System.out.println();

        ThisCar car2 = new ThisCar("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println("car2.maxSpeed : " + car2.maxSpeed);
        System.out.println();

        ThisCar car3 = new ThisCar("버스", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println("car3.maxSpeed : " + car3.maxSpeed);
        System.out.println();

        ThisCar car4 = new ThisCar("택시", "검정", 400);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    }

}

/*
    결과
        car1.company : 자바자동차
        car1.model : null
        car1.color : null
        car1.maxSpeed : 0

        car2.company : 자바자동차
        car2.model : 자가용
        car2.color : 은색
        car2.maxSpeed : 250

        car3.company : 자바자동차
        car3.model : 버스
        car3.color : 빨강
        car3.maxSpeed : 300

        car4.company : 자바자동차
        car4.model : 택시
        car4.color : 검정
        car4.maxSpeed : 400
 */