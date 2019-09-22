package _16_io.file;

import java.io.FileReader;

public class FileReaderExample {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(
            "src/main/java/_16_io/file/FileReaderExample.java"
        );

        int readCharNo;
        char[] cbuf = new char[100];
        while ((readCharNo = fr.read(cbuf)) != -1) {
            String data = new String(cbuf, 0 ,readCharNo);
            System.out.print(data);
        }
        fr.close();
    }

}

/*
    결과
        package _16_io.file;

        import java.io.FileReader;

        public class FileReaderExample {

            public static void main(String[] args) throws Exception {
                FileReader fr = new FileReader(
                    "src/main/java/_16_io/file/FileReaderExample.java"
                );

                int readCharNo;
                char[] cbuf = new char[100];
                while ((readCharNo = fr.read(cbuf)) != -1) {
                    String data = new String(cbuf, 0 ,readCharNo);
                    System.out.print(data);
                }
                fr.close();
            }

        }
 */