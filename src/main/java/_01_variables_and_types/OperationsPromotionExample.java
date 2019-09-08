package _01_variables_and_types;

public class OperationsPromotionExample {

    public static void main(String[] args) {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
//        byte byteValue3 = byteValue1 + byteValue2;  컴파일 에러(정수 연산일 경우 int 타입을 기본으로 한다.)
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);


        char charValue1 = 'A';
        char charValue2 = 1;
//        char charValue3 = charValue1 + charValue2;  컴파일 에러
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드= " + intValue2);
        System.out.println("출력문자= " + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3 / 4;
        System.out.println(intValue4);

        int intValue5 = 10;
//        int intValue6 = 10 / 4.0 컴파일 에러
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);
    }

}

/*
    결과
        30
        유니코드= 66
        출력문자= B
        2
        2.5
 */