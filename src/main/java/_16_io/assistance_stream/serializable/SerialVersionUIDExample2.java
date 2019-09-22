package _16_io.assistance_stream.serializable;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("temp/Object2.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ClassC classC = (ClassC) ois.readObject();
        System.out.println("field1: " + classC.field1);
    }

}

/*
    결과
        field1: 1

    위의 결과 후 classC 에 필드 field2 추가해서 재컴파일 / 실행하게 되면 serialVersionUID 바뀌므로 InvalidClassException 발생
    불가피하게 클래스의 수정이 필요하다면 클래스 작성 시 serialVersionUID 선언
 */