package _17_nio.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class PerformanceExample {

    public static void main(String[] args) throws IOException {
        Path from = Paths.get("src/main/java/_17_nio/temp/book.jpeg");
        Path to1 = Paths.get("src/main/java/_17_nio/temp/book2.jpeg");
        Path to2 = Paths.get("src/main/java/_17_nio/temp/book3.jpeg");

        long size = Files.size(from);

        FileChannel fileChannel_from = FileChannel.open(from);
        FileChannel fileChannel_to1 = FileChannel.open(to1, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));
        FileChannel fileChannel_to2 = FileChannel.open(to2, EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE));

        ByteBuffer nonDirectBuffer = ByteBuffer.allocate((int) size);
        ByteBuffer directBuffer = ByteBuffer.allocateDirect((int) size);

        long start, end;

        start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            fileChannel_from.read(nonDirectBuffer);
            nonDirectBuffer.flip();
            fileChannel_to1.write(nonDirectBuffer);
            nonDirectBuffer.clear();
        }
        end = System.nanoTime();
        System.out.println("넌다이렉트: " + (end - start) + " ns");

        fileChannel_from.position(0);   // 파일의 위치를 0으로 설정(처음으로 돌림)

        start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            fileChannel_from.read(directBuffer);
            nonDirectBuffer.flip();
            fileChannel_to2.write(directBuffer);
            nonDirectBuffer.clear();
        }
        end = System.nanoTime();
        System.out.println("다이렉트:\t " + (end - start) + " ns");

        fileChannel_from.close();
        fileChannel_to1.close();
        fileChannel_to2.close();
    }

}

/*
    결과
        넌다이렉트: 4000644 ns
        다이렉트:	 1203490 ns
 */