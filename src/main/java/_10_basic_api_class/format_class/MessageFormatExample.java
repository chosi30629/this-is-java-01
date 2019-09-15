package _10_basic_api_class.format_class;

import java.text.MessageFormat;

public class MessageFormatExample {

    public static void main(String[] args) {
        String id = "java";
        String name = "조성일";
        String tel = "018-1111-9999";

        String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
        String result1 = MessageFormat.format(text, id, name, tel);
        System.out.println(result1);
        System.out.println();

        String sql = "insert info member values( {0}, {1}, {2} )";
        Object[] arguments = {"'java'", "'조성일'", "'018-1111-9999'"};
        String result2 = MessageFormat.format(sql, arguments);
        System.out.println(result2);
    }

}

/*
    결과
        회원 ID: java
        회원 이름: 조성일
        회원 전화: 018-1111-9999

        insert info member values( 'java', '조성일', '018-1111-9999' )
 */