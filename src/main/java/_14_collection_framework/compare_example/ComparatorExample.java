package _14_collection_framework.compare_example;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

    public static void main(String[] args) {
        /*
        TreeSet<Fruit> treeSet = new TreeSet<>();
        Fruit 이 Comparable 을 구현하지 않았기 때문에 ClassCastException 발생
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        */

        TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator()); // 내림차순 정렬자 제공
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
        Iterator<Fruit> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + ": " + fruit.price);
        }
    }

}

/*
    결과
        수박: 10000
        딸기: 6000
        포도: 3000
 */