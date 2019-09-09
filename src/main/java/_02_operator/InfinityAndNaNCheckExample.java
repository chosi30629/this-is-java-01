package _02_operator;

public class InfinityAndNaNCheckExample {

    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;


        double z1 = x / y;
        double z2 = x % y;

        System.out.println(Double.isInfinite(z1));
        System.out.println(Double.isNaN(z1));
        System.out.println(Double.isInfinite(z2));
        System.out.println(Double.isNaN(z2));

        System.out.println(z1 + 2);
        System.out.println(z2 + 2);


        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            int d = a % b;
            System.out.println("c: " + c);
            System.out.println("d: " + d);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됨");
        }
    }

}

/*
    결과
        true
        false
        false
        true
        Infinity
        NaN
        0으로 나누면 안됨
 */