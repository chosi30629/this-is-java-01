package _17_nio.filechannel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWriteExample {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp/file7.txt");
        Files.createDirectories(path.getParent());

        FileChannel fileChannel = FileChannel.open(
            path, StandardOpenOption.CREATE, StandardOpenOption.WRITE
        );

        String data = "안녕하세요";
        Charset charset = Charset.defaultCharset();
        ByteBuffer byteBuffer = charset.encode(data);

        int byeCount = fileChannel.write(byteBuffer);   // 파일에 데이터 쓰기
        System.out.println("file7.txt : " + byeCount + " bytes written");

        fileChannel.close();
    }

}

/*
    결과
        file7.txt : 15 bytes written
 */