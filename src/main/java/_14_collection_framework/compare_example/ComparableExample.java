package _14_collection_framework.compare_example;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김씨플", 25));
        treeSet.add(new Person("박자바", 31));

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name + ": " + person.age);
        }
    }

}

/*
    TreeSet 과 TreeMap 은 정렬을 위해 Comparable 을 구현한 객체를 요구
    결과
        김씨플: 25
        박자바: 31
        홍길동: 45
 */
