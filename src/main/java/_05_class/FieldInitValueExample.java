package _05_class;

public class FieldInitValueExample {

    public static void main(String[] args) {
        FieldInitValue fieldInitValue = new FieldInitValue();

        System.out.println(fieldInitValue.byteField);
        System.out.println(fieldInitValue.shortField);
        System.out.println(fieldInitValue.intField);
        System.out.println(fieldInitValue.longField);
        System.out.println(fieldInitValue.booleanField);
        System.out.println(fieldInitValue.charField);
        System.out.println(fieldInitValue.floatField);
        System.out.println(fieldInitValue.doubleField);
        System.out.println(fieldInitValue.arrField);
        System.out.println(fieldInitValue.referenceField);
    }

}

/*
    결과
        0
        0
        0
        0
        false
                \u0000 (빈 공백)
        0.0
        0.0
        null
        null
 */