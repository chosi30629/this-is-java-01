package _10_basic_api_class.arrays_class;

import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]= " + scores[i]);
        }
        System.out.println();

        String[] names = {"홍길동", "박동수", "김자바"};
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]= " + names[i]);
        }
        System.out.println();

        Member m1 = new Member("홍길동");
        Member m2 = new Member("박동수");
        Member m3 = new Member("김자바");
        Member[] members = {m1, m2, m3};
        Arrays.sort(members);
        for (int i = 0; i < members.length; i++) {
            System.out.println("members[" + i + "].name= " + members[i].name);
        }
    }

}

/*
    결과
        scores[0]= 97
        scores[1]= 98
        scores[2]= 99

        names[0]= 김자바
        names[1]= 박동수
        names[2]= 홍길동

        members[0].name= 김자바
        members[1].name= 박동수
        members[2].name= 홍길동
 */