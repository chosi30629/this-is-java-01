package _16_io.console;

import java.io.OutputStream;

public class SystemOutExample {

    public static void main(String[] args) throws Exception {
        OutputStream os = System.out;

        for (byte b = 48; b < 58; b++) {
            os.write(b);    // 아스키 코드 48에서 57까지의 문자를 출력
        }
        os.write(10);   // 라인피드(10)을 출력하면 다음 행으로 넘어간다.

        for (byte b = 97; b < 123; b++) {
            os.write(b);
        }
        os.write(10);

        String hangul = "가나다라마바사아자차카타파하";
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes);

        os.flush();
    }

}

/*
    결과
        0123456789
        abcdefghijklmnopqrstuvwxyz
        가나다라마바사아자차카타파하
 */