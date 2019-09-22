package _16_io.assistance_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputSteamExample {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("temp/Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Integer(10));
        oos.writeObject(new Double(3.14));
        oos.writeObject(new int[] {1, 2, 3});
        oos.writeObject(new String("홍길동"));

        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("temp/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Integer obj1 = (Integer) ois.readObject();
        Double obj2 = (Double) ois.readObject();
        int[] obj3 = (int[]) ois.readObject();
        String obj4 = (String) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(Arrays.toString(obj3));
        System.out.println(obj4);
    }

}

/*
    결과
        10
        3.14
        [1, 2, 3]
        홍길동
 */