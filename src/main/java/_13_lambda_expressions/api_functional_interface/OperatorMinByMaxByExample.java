package _13_lambda_expressions.api_functional_interface;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

    public static void main(String[] args) {
        BinaryOperator<Fruit> binaryOperator;
        Fruit fruit;

        binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
        fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
        System.out.println(fruit.name);

        binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
        fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
        System.out.println(fruit.name);
    }

}


class Fruit {
    public String name;
    public Integer price;

    public Fruit(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

}

/*
    결과
        딸기
        수박
 */