package _04_reference_type;

public class ArrayCreateByNewExample {

    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }
        arr1[0] = 10;
        arr1[1] = 20;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }

        double[] arr2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }
        arr2[0] = 0.1;
        arr2[2] = 0.2;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }

        String[] arr3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
        arr3[1] = "1월";
        arr3[2] = "2월";
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
    }

}

/*
    결과
        arr1[0] : 0
        arr1[1] : 0
        arr1[2] : 0
        arr1[0] : 10
        arr1[1] : 20
        arr1[2] : 0
        arr2[0] : 0.0
        arr2[1] : 0.0
        arr2[2] : 0.0
        arr2[0] : 0.1
        arr2[1] : 0.0
        arr2[2] : 0.2
        arr3[0] : null
        arr3[1] : null
        arr3[2] : null
        arr3[0] : null
        arr3[1] : 1월
        arr3[2] : 2월
 */