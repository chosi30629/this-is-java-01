package _02_operator;

public class CharOperationExample {

    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
//        char c3 = c2 + 1;   컴파일 에러(char 타입이 산술 연산이 될 경우 int 타입으로 변환)
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
    }

}

/*
    결과
        c1: B
        c2: A
 */