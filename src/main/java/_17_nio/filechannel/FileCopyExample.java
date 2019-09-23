package _17_nio.filechannel;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCopyExample {

    public static void main(String[] args) throws Exception {
        Path from = Paths.get("src/main/java/_17_nio/temp/book.jpeg");
        Path to = Paths.get("src/main/java/_17_nio/temp/book1.jpeg");

        FileChannel fileChannel_from = FileChannel.open(
            from, StandardOpenOption.READ
        );

        FileChannel fileChannel_to = FileChannel.open(
            to, StandardOpenOption.CREATE, StandardOpenOption.WRITE
        );

        ByteBuffer buffer = ByteBuffer.allocateDirect(100);
        int byteCount;
        while (true) {
            buffer.clear();
            byteCount = fileChannel_from.read(buffer);  // 읽기
            if (byteCount == -1) {
                break;
            }
            buffer.flip();
            fileChannel_to.write(buffer);               // 쓰기
        }

        fileChannel_from.close();
        fileChannel_to.close();
        System.out.println("파일 복사 성공");

    }

}

/*
    결과
        파일 복사 성공
 */