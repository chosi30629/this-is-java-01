package _02_operator;

public class InfinityAndNaNCheckExample2 {

    public static void main(String[] args) {
        String userInput = "NaN";
//        String userInput = "Nan";   예외(NumberFormatException)
        double val = Double.valueOf(userInput);


        double currentBalance = 10000.0;

        if (Double.isNaN(val)) {
            System.out.println("NaN이 입력되어 처리할 수 없음");
            val = 0.0;
        }

        currentBalance += val;
        System.out.println(currentBalance);
    }

}

/*
    결과
        NaN이 입력되어 처리할 수 없음
        10000.0

 */
