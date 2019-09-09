package _02_operator;

public class StringEqualsExample {

    public static void main(String[] args) {
        String strVar1 = "조성일";
        String strVar2 = "조성일";
        String strVar3 = new String("조성일");

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1 == strVar3);
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));
    }

}

/*
    결과
        true
        false

        true
        true
 */