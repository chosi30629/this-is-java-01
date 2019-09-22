package _16_io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

    public static void main(String[] args) throws Exception {
        File file = new File("temp/file4.txt");
        FileWriter fw = new FileWriter(file, true);
        fw.write("FileWriter 는 한글로된 \r\n");
        fw.write("문자열을 바로 출력할 수 있다.\r\n");
        fw.flush();
        fw.close();
        System.out.println("파일에 저장되었습니다.");
    }

}

/*
    결과
        파일에 저장되었습니다.
 */