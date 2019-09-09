package _02_operator;

public class BitShiftExample {

    public static void main(String[] args) {
        System.out.println("1 << 3 = " + (1 << 3));
        System.out.println("-8 >> 3 = " + (-8 >> 3));
        System.out.println("-8 >>> 3 = " + (-8 >>> 3));
    }

}

/*
    결과
        1 << 3 = 8
        -8 >> 3 = -1
        -8 >>> 3 = 536870911
 */