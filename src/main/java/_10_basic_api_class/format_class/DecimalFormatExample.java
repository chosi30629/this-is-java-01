package _10_basic_api_class.format_class;

import java.text.DecimalFormat;

public class DecimalFormatExample {

    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0000000000.00000");
        System.out.println(df.format(num));

        df = new DecimalFormat("#");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.#");
        System.out.println(df.format(num));

        df = new DecimalFormat("##########.#####");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("+#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("-#.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));

        df = new DecimalFormat("0.0E0");
        System.out.println(df.format(num));

        df = new DecimalFormat("+#,### ; -#,###");
        System.out.println(df.format(num));

        df = new DecimalFormat("#.# %");
        System.out.println(df.format(num));

        df = new DecimalFormat("\u00A4 #,###");
        System.out.println(df.format(num));
    }

}

/*
    결과
        1234568
        1234567.9
        0001234567.89000
        1234568
        1234567.9
        1234567.89
        1234567.9
        +1234567.9
        -1234567.9
        1,234,567.9
        1.2E6
        +1,234,568
        123456789 %
        KRW 1,234,568
 */