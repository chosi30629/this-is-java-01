package _10_basic_api_class.string_class;

public class StringReplaceExample {

    public static void main(String[] args) {
        String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API 를 지원합니다.";
        String newStr1 = oldStr.replace("자바", "JAVA");
        String newStr2 = oldStr.replaceFirst("자바", "JAVA");
        String newStr3 = oldStr.replaceAll("자바", "JAVA");   // replace 와 차이점은 정규식 활용 가능
        System.out.println(oldStr);
        System.out.println(newStr1);
        System.out.println(newStr2);
        System.out.println(newStr3);
    }

}
