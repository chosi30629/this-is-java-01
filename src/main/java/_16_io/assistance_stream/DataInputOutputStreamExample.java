package _16_io.assistance_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("temp/primitive.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.9);
        dos.writeInt(1);

        dos.writeUTF("김자바");
        dos.writeDouble(90.3);
        dos.writeInt(2);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("temp/primitive.dat");
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < 2; i++) {
            // 위에서 쓴 기본타입 순서대로 출력
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }

        dis.close();
        fis.close();
    }

}

/*
    결과
        홍길동 : 95.9 : 1
        김자바 : 90.3 : 2
 */