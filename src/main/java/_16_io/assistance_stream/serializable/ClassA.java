package _16_io.assistance_stream.serializable;

import java.io.Serializable;

// Serializable : 객체 필드로 바이트로 직렬화해도 좋다. 직렬화시 구현 안하면 NotSerializableException
public class ClassA implements Serializable {
    // 직렬화에 포함
    int field1;
    ClassB field2 = new ClassB();

    // 직렬화에서 제외
    static int field3;
    transient int field4;
}
