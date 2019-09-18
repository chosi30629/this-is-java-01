package _14_collection_framework.list_example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBatis");
        list.add("iBatis");

        int size = list.size();
        System.out.println("총 객체수: " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBatis");

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
    }

}

/*
    결과
        총 객체수: 5

        2: Database

        0: Java
        1: JDBC
        2: Database
        3: Servlet/JSP
        4: iBatis
        5: iBatis

        0: Java
        1: JDBC
        2: iBatis
 */
