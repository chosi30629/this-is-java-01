package _17_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {

    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/_17_nio/FileExample.java");
//        Path path = Paths.get("temp/book.jpeg");
        System.out.println("디렉토리 여부: " + Files.isDirectory(path));
        System.out.println("파일 여부: " + Files.isRegularFile(path));
        System.out.println("마지막 수정 시간: " + Files.getLastModifiedTime(path));
        System.out.println("파일 크기: " + Files.size(path));
        System.out.println("소유자: " + Files.getOwner(path).getName());
        System.out.println("숨김 파일 여부: " + Files.isHidden(path));
        System.out.println("읽기 가능 여부: " + Files.isReadable(path));
        System.out.println("쓰기 가능 여부: " + Files.isWritable(path));
        System.out.println("MIME 타입: " + Files.probeContentType(path));
    }

}

/*
    결과
        디렉토리 여부: false
        파일 여부: true
        마지막 수정 시간: 2019-09-22T13:46:21Z
        파일 크기: 1374
        소유자: choseongil
        숨김 파일 여부: false
        읽기 가능 여부: true
        쓰기 가능 여부: true
        MIME 타입: null - 버그라는듯
 */