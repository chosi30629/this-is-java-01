package _16_io.console;

import java.io.InputStream;

public class SystemInExample2 {

    public static void main(String[] args) throws Exception {
        InputStream is = System.in;

        byte[] datas = new byte[100];

        System.out.print("이름: ");
        int nameBytes = is.read(datas);
        String name = new String(datas, 0, nameBytes - 1);      // 끝에 2바이트는 Enter 키에 해당하는 캐리지 리턴(13)과 라인 피드(10)이므로 문자열에서 제외
                                                                            // 1. 윈도우 : CRLF(\r\n)
                                                                            //
                                                                            // 2. 유닉스 : LF(\n)
                                                                            //
                                                                            // 3. 맥 : CR(\r)
        System.out.print("하고 싶은말: ");
        int commentBytes = is.read(datas);
        String comment = new String(datas, 0 , commentBytes - 1);

        System.out.println("입력한 이름: " + name);
        System.out.println("입력한 하고 싶은말: " + comment);
    }

}

/*
    결과
        이름: 홍길동
        하고 싶은말: 안녕하세요.
        입력한 이름: 홍길동
        입력한 하고 싶은말: 안녕하세요.
 */