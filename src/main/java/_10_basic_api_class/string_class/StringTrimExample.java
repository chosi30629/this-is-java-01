package _10_basic_api_class.string_class;

public class StringTrimExample {

    public static void main(String[] args) {
        String tel1 = " 02";
        String tel2 = "123 ";
        String tel3 = " 1234 ";

        String tel = tel1.trim() + tel2.trim() + tel3.trim();
        System.out.println(tel);
    }

}

/*
    결과
        021231234
 */
