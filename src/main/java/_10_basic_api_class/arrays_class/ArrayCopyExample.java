package _10_basic_api_class.arrays_class;

import java.util.Arrays;

public class ArrayCopyExample {

    public static void main(String[] args) {
        char[] arr1 = {'J', 'A', 'V', 'A'};

        char[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));

        char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
        System.out.println(Arrays.toString(arr3));

        char[] arr4 = new char[arr1.length];
        System.arraycopy(arr1, 0, arr4, 0 , arr1.length);
        System.out.println(Arrays.toString(arr4));
    }

}

/*
    결과
        [J, A, V, A]
        [A, V]
        [J, A, V, A]
 */