package _01_variables_and_types;

public class PromotionExample {

    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;   // int <- byte
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;       // int <- char
        System.out.println("'가'의 유니코드= " + intValue);

        intValue = 500;
        long longValue = intValue;  // long <- int
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;  // double <- int
        System.out.println(doubleValue);

        float floatValue = longValue;
        System.out.println(floatValue) ; // float <- long

        char charValue1 = 'A';
//        short shortValue = charValue1;  컴파일 에러
    }

}

/*
    byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
    float 는 4byte 크기인데 int(4byte)와 long(8byte)보다 더 큰 타입인 이유는 표현할 수있는 값의 범위가 float 이 더 크기 때문이다.

    결과
        10
        '가'의 유니코드= 44032
        500
        200.0
        500.
 */