package _10_basic_api_class.math_random_class;

public class MathRandomExample {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        System.out.println("주사위 눈: " + num);
    }
}

/*
    결과
        주사위 눈: 5
 */