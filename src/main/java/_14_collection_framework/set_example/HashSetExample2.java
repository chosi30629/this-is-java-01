package _14_collection_framework.set_example;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30)); // 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장(Member 클래스에서 hashcode 와 equals 재정의함)
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체수 : " + set.size());
    }

}

/*
    결과
        총 객체수 : 1
 */
