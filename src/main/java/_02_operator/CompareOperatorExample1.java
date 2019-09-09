package _02_operator;

public class CompareOperatorExample1 {

    public static void main(String[] args) {
        char char1 = 'A';
        char char2 = 'B';
        boolean result = (char1 < char2);
        System.out.println("result= " + result);
    }

}

/*
    char 타입은 유니코드 값으로 비교 연산을 수행함
        결과
            result= true
 */