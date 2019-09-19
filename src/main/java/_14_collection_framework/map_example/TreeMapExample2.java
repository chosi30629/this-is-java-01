package _14_collection_framework.map_example;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "홍길동");
        scores.put(98, "이자바");
        scores.put(75, "씨언어");
        scores.put(95, "도커");
        scores.put(80, "리팩토");

        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : descendingEntrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue() + " ");
        }
        System.out.println();

        NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
        Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
        for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue() + "");
        }
    }

}

/*
    결과
        98-이자바
        95-도커
        87-홍길동
        80-리팩토
        75-씨언어

        75-씨언어
        80-리팩토
        87-홍길동
        95-도커
        98-이자바
 */