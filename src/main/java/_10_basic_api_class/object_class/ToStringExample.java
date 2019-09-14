package _10_basic_api_class.object_class;

import java.util.Date;

public class ToStringExample {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Date obj2 = new Date();

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }

}


/*
    결과
        java.lang.Object@61bbe9ba
        Sat Sep 14 14:54:40 KST 2019
 */