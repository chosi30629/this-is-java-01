package _14_collection_framework.set_example;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("[c ~ f 사이의 단어 검색]");
        NavigableSet<String> rangeSet1 = treeSet.subSet("c", true, "f", true);
        for (String word : rangeSet1) {
            System.out.println(word);
        }

        System.out.println("[a ~ c 사이의 단어 검색]");
        NavigableSet<String> rangeSet2 = treeSet.headSet("c", true);
        for (String word : rangeSet2) {
            System.out.println(word);
        }

        System.out.println("[cherry ~ z 사이의 단어 검색]");
        NavigableSet<String> rangeSet3 = treeSet.tailSet("cherry", false);
        for (String word : rangeSet3) {
            System.out.println(word);
        }
    }

}

/*
    결과
        [c ~ f 사이의 단어 검색]
        cherry
        description
        ever
        [a ~ c 사이의 단어 검색]
        apple
        base
        [cherry ~ z 사이의 단어 검색]
        description
        ever
        forever
        guess
        zoo
 */
