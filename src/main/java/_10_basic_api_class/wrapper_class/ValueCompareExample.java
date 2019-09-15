package _10_basic_api_class.wrapper_class;

public class ValueCompareExample {

    public static void main(String[] args) {
        System.out.println("[-128 ~ 127 초과값일 경우]");
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==결과: " + (obj1 == obj2));
        System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
        System.out.println("equals() 결과: " + obj1.equals(obj2));
        System.out.println();

        System.out.println("[-128 ~ 127 범위일 경우]");
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==결과: " + (obj3 == obj4));
        System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
        System.out.println("equals() 결과: " + obj3.equals(obj4));
        System.out.println();
    }

}

/*
    박싱된 값이 boolean(true, false), char(\u0000 ~ \u007f), byte, short, int(-128 ~ 127) 이면 == 와 != 연산자로 내부의 값을
    바로 비교할 수 있다. 되도록이면 equals() 메소드로 내부 값을 비교하자.

    결과
        [-128 ~ 127 초과값일 경우]
        ==결과: false
        언박싱후 ==결과: true
        equals() 결과: true

        [-128 ~ 127 범위일 경우]
        ==결과: true
        언박싱후 ==결과: true
        equals() 결과: true
 */