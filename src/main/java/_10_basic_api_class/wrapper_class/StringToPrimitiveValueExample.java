package _10_basic_api_class.wrapper_class;

public class StringToPrimitiveValueExample {

    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");
        byte value4 = Byte.parseByte("20");
        short value5 = Short.parseShort("30");
        long value6 = Long.parseLong("40"); // 40L 예외
        float value7 = Float.parseFloat("3.55F");

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
    }

}
