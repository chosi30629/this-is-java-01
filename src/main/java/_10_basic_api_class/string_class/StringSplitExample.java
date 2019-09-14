package _10_basic_api_class.string_class;

public class StringSplitExample {

    public static void main(String[] args) {
        // String.split 은 정규식으로 구분, StringTokenizer 는 문자로 구분
        String text = "홍길동&이자바,박씨플,김씨샵-최맥북";

        String[] names = text.split("&|,|-");

        for (String name : names) {
            System.out.println(name);
        }
    }

}

/*
    결과
        홍길동
        이자바
        박씨플
        김씨샵
        최맥북
 */