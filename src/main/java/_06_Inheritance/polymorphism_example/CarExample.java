package _06_Inheritance.polymorphism_example;

/**
 *  다형성 예제
 */
public class CarExample {

    public static void main(String[] args) {
        Car car = new Car();

        for(int i = 1; i < 5; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 HankookTire 로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 KumhoTire 로 교체");
                    car.frontLeftTire = new KumhoTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 HankookTire 로 교체");
                    car.frontLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 KumhoTire 로 교체");
                    car.frontLeftTire = new KumhoTire("뒤오른쪽", 17);
                    break;
            }
            System.out.println("----------------------");
        }
    }

}

/*
    결과
        [자동차가 달립니다.]
        앞왼쪽 Tire 수명: 5회
        앞오른쪽 Tire 수명: 1회
        뒤왼쪽 Tire 수명: 2회
        뒤왼쪽 Tire 수명: 3회
        ----------------------
        [자동차가 달립니다.]
        앞왼쪽 Tire 수명: 4회
        ***앞오른쪽 Tire 펑크 ***
        [자동차가 멈춥니다.]
        앞오른쪽 KumhoTire 로 교체
        ----------------------
        [자동차가 달립니다.]
        앞오른쪽 KumhoTire 수명: 12회
        ***앞오른쪽 Tire 펑크 ***
        [자동차가 멈춥니다.]
        앞오른쪽 KumhoTire 로 교체
        ----------------------
        [자동차가 달립니다.]
        앞오른쪽 KumhoTire 수명: 12회
        ***앞오른쪽 Tire 펑크 ***
        [자동차가 멈춥니다.]
        앞오른쪽 KumhoTire 로 교체
        ----------------------
 */