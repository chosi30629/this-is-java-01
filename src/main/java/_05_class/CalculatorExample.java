package _05_class;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.powerOn();

        int result = calculator.plus(5, 6);
        System.out.println(result);

        byte x = 10;
        byte y = 4;
        double result2 = calculator.divide(x, y);
        System.out.println(result2);

        calculator.powerOff();
    }

}

/*
    결과
        전원을 켭니다.
        11
        2.5
        전원을 끕니다.
 */