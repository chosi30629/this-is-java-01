package _01_variables_and_types;

public class CastingExample {

    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) 44032;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);

        float flaotValue = 3.78f;
        longValue = (long) flaotValue;
        System.out.println(longValue);

        byte byteValue = 65;
//        char charValue = byteValue; 컴파일 에러 char 는 2byte 의 크기를 가지지만, char 의 범위는 0 ~ 65535 이므로 음수가 저장될 수 없다.
        char charData = (char) byteValue;
        System.out.println(charData);

        String strValue = "A";
//        char charData2 = (char) strValue; 컴파일 에러
    }

}

/*
    결과
        가
        500
        3
        3
        A
 */