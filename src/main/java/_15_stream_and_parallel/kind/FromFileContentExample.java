package _15_stream_and_parallel.kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/_15_stream_and_parallel/kind/linedata.txt");
        Stream<String> stream;

        stream = Files.lines(path, Charset.defaultCharset());   // 운영체제의 기본 문자셋. 나는 UTF-8
        stream.forEach(System.out :: println);  // 메소드 참조(s -> System.out.println(s)와 동일
        System.out.println();

        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out :: println);
    }

}

/*
    결과
        Java8에서 추가된 새로운 기능
        1. 람다식
        2. 메소드 참조
        3. 디폴드 메소드와 정적 메소드
        4. 새로운 API 패키지

        Java8에서 추가된 새로운 기능
        1. 람다식
        2. 메소드 참조
        3. 디폴드 메소드와 정적 메소드
        4. 새로운 API 패키지
 */