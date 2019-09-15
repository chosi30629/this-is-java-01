package _10_basic_api_class.arrays_class;

import java.util.Arrays;

public class SearchExample {

    public static void main(String[] args) {
        // 먼저 sort 를 하고 binarySearch 를 해야함

        // 기본 타입값 검색
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 99);
        System.out.println("찾은 인덱스: " + index);

        // 문자열 검색
        String[] names = {"홍길동", "김클린", "이코드"};
        Arrays.sort(names);
        index = Arrays.binarySearch(names, "홍길동");
        System.out.println("찾은 인덱스: " + index);

        // 객체 검색
        Member m1 = new Member("홍길동");
        Member m2 = new Member("김클린");
        Member m3 = new Member("이코드");
        Member[] members = {m1, m2, m3};
        Arrays.sort(members);
        index = Arrays.binarySearch(members, m1);
        System.out.println("찾은 인덱스: " + index);
    }

}

/*
    결과
        찾은 인덱스: 2
        찾은 인덱스: 2
        찾은 인덱스: 2
 */