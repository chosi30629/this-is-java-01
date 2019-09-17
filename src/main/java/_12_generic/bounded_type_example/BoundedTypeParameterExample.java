package _12_generic.bounded_type_example;

public class BoundedTypeParameterExample {

    public static void main(String[] args) {
//        String str = Util.compare("a", "b");     Number 타입이 아님

        int result1 = Util.compare(10, 20);
        System.out.println(result1);

        int result = Util.compare(4.5, 3);
        System.out.println(result);
    }

}

/*
    결과
        -1
        1
 */
