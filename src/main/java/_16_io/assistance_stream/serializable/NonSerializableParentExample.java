package _16_io.assistance_stream.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("temp/Object3.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Child child = new Child();
        child.field1 = "홍길동";
        child.field2 = "김자바";
        oos.writeObject(child);
        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("temp/Object3.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Child v = (Child) ois.readObject();
        System.out.println(v.field1);
        System.out.println(v.field2);

        ois.close();
        fis.close();
    }

}

/*
    결과
        홍길동
        김자바
 */