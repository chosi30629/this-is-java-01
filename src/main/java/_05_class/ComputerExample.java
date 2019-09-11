package _05_class;

import java.util.Arrays;
import java.util.List;

public class ComputerExample {

    public static void main(String[] args) {
        Computer computer = new Computer();

        int[] value1 = {1, 2, 3};
        int result1 = computer.sum1(value1);
        System.out.println("result1: " + result1);

        int result2 = computer.sum1(new int[] {1, 2, 3, 4, 5});
        System.out.println("result2: " + result2);

        int result3 = computer.sum2(1, 2, 3);
        System.out.println("result3: " + result3);

        int result4 = computer.sum2(1, 2, 3, 4, 5);
        System.out.println("result4: " + result4);

        int result5 = computer.sum2(new int[] {1, 2, 3});
        System.out.println("result5: " + result5);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        int result6 = computer.sum2(list);  컴파일 에러
//        int result6 = computer.sum1(1, 2, 3);   컴파일 에러
    }

}

/*
    ... 로 선언된 매개 변수는 배열 타입

    결과
        result1: 6
        result2: 15
        result3: 6
        result4: 15
        result5: 6
 */