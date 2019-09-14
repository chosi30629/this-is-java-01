package _10_basic_api_class.stringtokenizer_class;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String text = "홍길동/이래밍/박찰스";

        // 전체 토큰 수를 얻어 for 문으로 루핑
        // 두번째 매개값을 안주면 구분자는 기본적으로 공백(Space)이 기본 구분자
        StringTokenizer st = new StringTokenizer(text, "/");
        int countTokens = st.countTokens();
        for (int i = 0; i < countTokens; i++) {
            String token = st.nextToken();
            System.out.println(token);
        }

        System.out.println();

        // 남아 있는 토큰을 확인하고 while 문으로 루핑
        st = new StringTokenizer(text, "/");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }

}

/*
    결과
        홍길동
        이래밍
        박찰스

        홍길동
        이래밍
        박찰스
 */