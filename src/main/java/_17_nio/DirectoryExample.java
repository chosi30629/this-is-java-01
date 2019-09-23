package _17_nio;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExample {

    public static void main(String[] args) throws Exception {
        Path path1 = Paths.get("temp/dir/subdir");
        Path path2 = Paths.get("temp/file6.txt");

        if (Files.notExists(path1)) {
            Files.createDirectories(path1);
        }

        if (Files.notExists(path2)) {
            Files.createFile(path2);
        }

        Path path3 = Paths.get("temp");
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);    // 디렉토리 내용을 스트림(반복자)으로 얻음
        for (Path path : directoryStream) {
            if (Files.isDirectory(path)) {
                System.out.println("[디렉토리] " + path.getFileName());
            } else {
                System.out.println("[파일]" + path.getFileName() + " (크기: " + Files.size(path) + ")");
            }
        }
    }

}

/*
    결과
        [파일]file2.txt (크기: 0)
        [파일]file3.txt (크기: 0)
        [파일]file1.txt (크기: 102)
        [파일]book.jpeg (크기: 83762)
        [파일]file4.txt (크기: 214)
        [파일]file5.txt (크기: 66)
        [파일]primitive.dat (크기: 46)
        [파일]file6.txt (크기: 0)
        [파일]Object1.dat (크기: 210)
        [파일]Object.dat (크기: 181)
        [디렉토리] dir
        [파일]Object2.dat (크기: 104)
        [파일]Object3.dat (크기: 120)
 */