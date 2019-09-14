package _10_basic_api_class.string_buffer_builder_class;

public class StringBuilderExample {

    /*
        StringBuffer 와 StringBuilder 의 사용 방법은 동일한데 차이점은 StringBuffer 는 멀티 스레드 환경에서 사용할 수 있도록
        동기화가 적용되어 있어 스레드에 안전하지만, StringBuilder 는 단일 스레드 완경에서만 사용하도록 설계되어 있다.
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("Program Study");
        System.out.println(sb.toString());

        sb.insert(4, "2");              // 4번째 문자 뒤에 2를 삽입
        System.out.println(sb.toString());

        sb.setCharAt(4, '6');           //   4번째 문자 뒤의 문자를 6으로 변경
        System.out.println(sb.toString());

        sb.replace(6, 13, "Book");  //  6번째 문자 뒤부터 13번째 문자까지를 "Book" 문자열로 대치
        System.out.println(sb.toString());

        sb.delete(4, 5);                         // 5번째 문자를 삭제
        System.out.println(sb.toString());

        int length = sb.length();
        System.out.println("총문자수: " + length);

        String result = sb.toString();
        System.out.println(result);

        System.out.println(sb.reverse());       // 역순
    }

}

/*
    결과
        Java Program Study
        Java2 Program Study
        Java6 Program Study
        Java6 Book Study
        Java Book Study
        총문자수: 15
        Java Book Study
        ydutS kooB avaJ
 */
