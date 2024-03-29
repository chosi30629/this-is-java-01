package _16_io.assistance_stream.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("temp/Object1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ClassA classA = new ClassA();
        classA.field1 = 1;
        classA.field2.filed1 = 2;
        classA.field3 = 3;
        classA.field4 = 4;
        oos.writeObject(classA);
        oos.flush();
        oos.close();
        fos.close();
    }

}
