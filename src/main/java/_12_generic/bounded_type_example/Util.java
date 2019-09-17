package _12_generic.bounded_type_example;

public class Util {

    // 상위 타입이 인터페이스더라도 extends 키워드 사용
    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);
    }

}
