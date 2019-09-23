package _17_nio.filechannel;

import java.io.IOException;
import java.nio.file.*;

public class FilesCopyMethodExample {

    public static void main(String[] args) throws IOException {
        Path from = Paths.get("src/main/java/_17_nio/temp/book.jpeg");
        Path to = Paths.get("src/main/java/_17_nio/temp/book4.jpeg");

        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("파일 복사 성공");
    }

}

/*
    결과
        파일 복사 성공
 */