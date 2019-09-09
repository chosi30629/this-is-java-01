package _02_operator;

public class BitLogicExample {

    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
    }

}

/*
    결과
        45 & 25 = 9
        45 | 25 = 61
        45 ^ 25 = 52
        ~45 = -46
 */