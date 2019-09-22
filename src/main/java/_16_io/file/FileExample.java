package _16_io.file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

    public static void main(String[] args) throws Exception {
        File dir = new File("temp/dir");
        File file1 = new File("temp/file1.txt");
        File file2 = new File("temp/file2.txt");
        File file3 = new File(new URI("file:///Users/choseongil/IdeaProjects/this-is-java/temp/file3.txt"));

        if (!dir.exists()) {
            dir.mkdirs();
        }
        if (!file1.exists()) {
            file1.createNewFile();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        if (!file3.exists()) {
            file3.createNewFile();
        }

        File temp = new File("temp");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd\t\ta\tHH:mm");
        File[] contents = temp.listFiles();
        System.out.println("날짜\t\t\t\t시간\t\t\t형태\t\t크기\t\t이름");
        System.out.println("----------------------------------------------");
        for (File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.print("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }

}

/*
    결과
            날짜				시간			형태		크기		이름
        ----------------------------------------------
        2019-09-22		PM	12:02			0	file2.txt
        2019-09-22		PM	12:02			0	file3.txt
        2019-09-22		PM	12:02			0	file1.txt
        2019-09-22		PM	12:13	<DIR>			dir
 */