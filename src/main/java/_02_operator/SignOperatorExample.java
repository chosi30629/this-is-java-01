package _02_operator;

public class SignOperatorExample {

    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1= " + result1);
        System.out.println("result2= " + result2);


        short s = 100;
//        short result3 = -s; 컴파일 에러(부호 연산자를 사용할 때 주의할 점은 부호 연산자의 산출 타입은 int 타입이 된다.)
        int result3 = -s;
        System.out.println("result3= " + result3);
    }

}

/*
    결과
        result1= -100
        result2= 100
        result3= -100
 */
