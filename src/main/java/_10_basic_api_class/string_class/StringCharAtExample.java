package _10_basic_api_class.string_class;

public class StringCharAtExample {

    public static void main(String[] args) {
        String ssn = "010624-1230123";
        char gender = ssn.charAt(7);
        switch (gender) {
            case '1':
            case '3':
                System.out.println("남자");
                break;
            case '2':
            case '4':
                System.out.println("여자");
                break;
        }
    }

}

/*
    결과
        남자
 */