package _16_io.assistance_stream.serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 부모 클래스에 부득이하게 implements Serializable 못 할때 하는 방법
public class Child extends Parent implements Serializable {
    public String field2;


    // 둘다 private 여야만 자동호출
    // 직렬화될 때 자동호출
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(field1);
        out.defaultWriteObject();
    }

    // 역직렬화될 때 자동호출
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        field1 = in.readUTF();
        in.defaultReadObject();
    }

}
