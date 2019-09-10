package _04_reference_type;

public class ArrayCreateByValueListExample {

    public static void main(String[] args) {
        int[] arr1;

        int arr2[];

        int[] arr3 = {1, 2, 3};

        int[] arr4;
//        arr4 = {1, 2, 3};   컴파일 에러
        arr4 = new int[] {1, 2, 3};



        int[] scores;
        scores = new int[] {83, 90 ,87};
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

//        int sum2 = add({83, 90, 87});   컴파일 에러
        int sum2 = add(new int[] {83, 90, 87});
        System.out.println("총합 : " + sum2);
        System.out.println();
    }

    private static int add(int[] scores) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        return sum;
    }

}

/*
    결과
        총합 : 260
        총합 : 260
 */