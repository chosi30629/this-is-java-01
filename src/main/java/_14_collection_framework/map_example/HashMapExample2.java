package _14_collection_framework.map_example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {

    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(1, "홍길동"), 90);

        System.out.println("총 Entry 수: " + map.size());
        Set<Student> students = map.keySet();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Integer score = map.get(iterator.next());
            System.out.println(score);
        }
    }

}

/*
    결과
        총 Entry 수: 1
        90

 */