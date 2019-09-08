package _01_variables_and_types;

public class FromIntToFloatAndDouble {

    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int) num3;

        int result1 = num1 - num2;
        System.out.println(result1);


        num2 = 123456780;
        double num4 = num2;
        num2 = (int) num4;

        int result2 = num1 - num2;
        System.out.println(result2);
    }

}

/*
    결과
        -4
        0
 */
