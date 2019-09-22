package _16_io.file;


import java.io.FileInputStream;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                "src/main/java/_16_io/file/FileInputStreamExample.java"
            );

            int data;
            while ((data = fis.read()) != -1) {
                System.out.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

/*
    결과
        package _16_io.file;


        import java.io.FileInputStream;

        public class FileInputStreamExample {

            public static void main(String[] args) {
                try {
                    FileInputStream fis = new FileInputStream(
                        "src/main/java/_16_io/file/FileInputStreamExample.java"
                    );

                    int data;
                    while ((data = fis.read()) != -1) {
                        System.out.write(data);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

 */