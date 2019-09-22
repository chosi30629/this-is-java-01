package _16_io.assistance_stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        System.out.print("입력: " );
        String lineString = br.readLine();

        System.out.println("출력: " + lineString);
    }

}

/*
    결과
        입력: 한줄 전체를 읽습니다.
        출력: 한줄 전체를 읽습니다.
 */
