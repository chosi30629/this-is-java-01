package _14_collection_framework.lifo_fifo_example;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();  // pop 은 객체를 스택에서 제거, peek 은 객체를 스택에서 제거하지 않음. 둘 다 스택의 맨 위 객체를 가져옴
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }

}

/*
    결과
        꺼내온 동전 : 10원
        꺼내온 동전 : 500원
        꺼내온 동전 : 50원
        꺼내온 동전 : 100원
 */
