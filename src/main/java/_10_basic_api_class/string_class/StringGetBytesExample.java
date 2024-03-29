package _10_basic_api_class.string_class;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

    public static void main(String[] args) {
        String str = "안녕하세요.";

        byte[] bytes1 = str.getBytes();
        System.out.println("bytes1.length: " + bytes1.length);
        String str1 = new String(bytes1);
        System.out.println("bytes1 -> String: " + str1);

        try {
            byte[] bytes2 = str.getBytes("EUC-KR");
            System.out.println("byte2.length: " + bytes2.length);
            String str2 = new String(bytes2, "EUC-KR");
            System.out.println("bytes2 -> String: " + str2);

            byte[] bytes3 = str.getBytes("UTF-8");
            System.out.println("byte3.length: " + bytes3.length);
            String str3 = new String(bytes3, "UTF-8");
            System.out.println("bytes3 -> String: " + str3);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}

/*
    결과
        bytes1.length: 16
        bytes1 -> String: 안녕하세요.
        byte2.length: 11
        bytes2 -> String: 안녕하세요.
        byte3.length: 16
        bytes3 -> String: 안녕하세요.
 */