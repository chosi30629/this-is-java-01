package _15_stream_and_parallel.kind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p -> System.out.println(p.getFileName()));   // p: 서브 디렉토리 또는 파일에 해당하는 Path 객체
    }

}

/*
    결과
        _07_interface
        _06_inheritance
        _09_exception_handling
        _13_lambda_expressions
        _11_multi_thread
        _15_stream_and_parallel
        _03_conditional_statement_and_repeat_statement
        _08_nested_class_interface
        _01_variables_and_types
        _02_operator
        _14_collection_framework
        _12_generic
        _04_reference_type
        _10_basic_api_class
        _05_class
 */