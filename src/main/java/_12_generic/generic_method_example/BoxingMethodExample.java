package _12_generic.generic_method_example;

import _12_generic.generic_type_example.GenericBox;

public class BoxingMethodExample {

    public static void main(String[] args) {
        GenericBox<Integer> box1 = Util.<Integer>boxing(100); // 타입 파라미터를 명시적으로 지정
        int intValue = box1.get();

        GenericBox<String> box2 = Util.boxing("홍길동");       // 타입 파라미터를 추정
        String strValue = box2.get();
    }

}
