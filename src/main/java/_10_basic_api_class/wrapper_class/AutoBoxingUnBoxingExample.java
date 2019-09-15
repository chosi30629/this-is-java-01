package _10_basic_api_class.wrapper_class;

public class AutoBoxingUnBoxingExample {

    public static void main(String[] args) {
        // 자동 Boxing
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        // 대입 시 자동 Unboxing
        int value = obj;
        System.out.println("value: " + value);

        // 연산 시 자동 Unboxing
        int result = obj + 100;
        System.out.println("result: " + result);
    }

}

/*
    결과
        value: 100
        value: 100
        result: 200
 */