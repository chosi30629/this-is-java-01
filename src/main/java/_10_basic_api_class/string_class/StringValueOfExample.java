package _10_basic_api_class.string_class;

public class StringValueOfExample {

    public static void main(String[] args) {
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(10.5);
        String str3 = String.valueOf(true);
        String str4 = String.valueOf(20L);
        String str5 = String.valueOf(20.5f);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }

}

/*
    결과
        10
        10.5
        true
        20
        20.5
 */