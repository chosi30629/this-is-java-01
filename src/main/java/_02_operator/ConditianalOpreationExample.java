package _02_operator;

public class ConditianalOpreationExample {

    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }

}

/*
    결과
        85점은 B등급입니다.
 */