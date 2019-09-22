package _16_io.assistance_stream.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("temp/Object2.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ClassC classC = new ClassC();
        classC.field1 = 1;
        oos.writeObject(classC);
        oos.flush();
        oos.close();
        fos.close();
    }

}
