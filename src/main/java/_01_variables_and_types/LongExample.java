package _01_variables_and_types;

public class LongExample {

    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
//        long var3 = 1000000000000; 컴파일 에러(l 이나 L 을 붙여야함)
        long var4 = 1000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }

}

/*
    결과
        10
        20
        1000000000000
 */