package _14_collection_framework.map_example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("김자바", 85);
        map.put("박씨샾", 65);
        map.put("스칼라", 75);
        map.put("김자바", 95);
        System.out.println("총 Entry 수: " + map.size());

        System.out.println("\t김자바 : " + map.get("김자바"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        map.remove("김자바");
        System.out.println("총 Entry 수: " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        map.clear();
        System.out.println("총 Entry 수: " + map.size());
    }

}

/*
    결과
        총 Entry 수: 3
            김자바 : 95

            스칼라 : 75
            박씨샾 : 65
            김자바 : 95

        총 Entry 수: 2
            스칼라 : 75
            박씨샾 : 65

        총 Entry 수: 0
 */