package _16_io.assistance_stream;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

    public static void main(String[] args) throws Exception {
        // FileReader 내부 방식과 동일
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);

        int readCharNo;
        char[] cbuf = new char[100];
        while ((readCharNo = reader.read(cbuf)) != -1) {
            String data = new String(cbuf, 0, readCharNo);
            System.out.println(data);
        }

        reader.close();
    }

}

/*
    결과
        바이트입력스트림을 문자입력스트림으로 변화
        바이트입력스트림을 문자입력스트림으로 변화
 */
