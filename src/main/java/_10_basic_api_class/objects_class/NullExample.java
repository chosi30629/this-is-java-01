package _10_basic_api_class.objects_class;

import java.util.Objects;

public class NullExample {

    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.isNull(str1));
        System.out.println(Objects.nonNull(str2));
        System.out.println(Objects.requireNonNull(str1));

        try {
            String name = Objects.requireNonNull(str2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            String name = Objects.requireNonNull(str2, "이름이 없습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            String name = Objects.requireNonNull(str2, () -> "이름이 없다니깐요.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

/*
    결과
        false
        false
        홍길동
        null
        이름이 없습니다.
        이름이 없다니깐요.
 */