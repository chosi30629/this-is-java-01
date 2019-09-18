package _14_collection_framework.set_example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("iBatis");

        int size = set.size();
        System.out.println("총 객체수: " + size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBatis");

        System.out.println("총 객체수: " + set.size());

        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }

}

/*
    결과
        총 객체수: 4
            Java
            JSP
            JDBC
            iBatis
        총 객체수: 2
            Java
            JSP
        비어 있음
 */