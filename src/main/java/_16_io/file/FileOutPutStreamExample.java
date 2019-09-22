package _16_io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutPutStreamExample {

    public static void main(String[] args) throws Exception {
        String originalFileName = "src/main/java/_16_io/file/book.jpeg";
        String targetFileName = "temp/book.jpeg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName); //  생성자의 두번째 매개변수에 true 를 주면 기존 파일을 덮어쓰지 않고 내용을 추가

        int readByteNo;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fis.read(readBytes)) != -1) {
            fos.write(readBytes, 0,readByteNo);
        }

        fos.flush();
        fos.close();
        fis.close();

        System.out.println("복사가 잘 되었습니다.");
    }

}

/*
    결과
        복사가 잘 되었습니다.
 */