package _02_operator;

public class InfinityAndNaNCheckExample1 {

    public static void main(String[] args) {
        String userInput = "NaN";
//        String userInput = "Nan";   예외(NumberFormatException)
        double val = Double.valueOf(userInput);


        double currentBalance = 10000.0;


        currentBalance += val;
        System.out.println(currentBalance);
    }

}

/*
    결과
        NaN
 */
