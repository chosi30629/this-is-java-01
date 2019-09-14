package _10_basic_api_class.objects_class;

import java.util.Objects;

public class ToStringExample {

    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));
        System.out.println(Objects.toString(str1, "이름이 없습니다."));
        System.out.println(Objects.toString(str2, "이름이 없습니다."));

    }

}

/*
    결과
        홍길동
        null
        홍길동
        이름이 없습니다.
 */