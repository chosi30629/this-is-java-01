package _10_basic_api_class.system_class;

public class SystemTimeExample {

    public static void main(String[] args) {
        long time1 = System.nanoTime();
        long time3 = System.currentTimeMillis();

        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }

        long time2 = System.nanoTime();
        long time4 = System.currentTimeMillis();

        System.out.println("1 ~ 1000000 까지 의 합: " + sum);
        System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");
        System.out.println("계산에 " + (time4 - time3) + " 밀리초가 소요되었습니다.");
    }

}

/*
    결과
        1 ~ 1000000 까지 의 합: 1784293664
        계산에 4892385 나노초가 소요되었습니다.
        계산에 5 밀리초가 소요되었습니다.
 */