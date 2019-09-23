package _17_nio.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ComputerByteOrderExample {

    public static void main(String[] args) {
        System.out.println("운영체제 종류 : " + System.getProperty("os.name"));
        System.out.println("네이티브의 바이트 해석 순서 : " + ByteOrder.nativeOrder());

        // 운영체제와 JVM 의 바이트 해석 순서가 다를 경우 운영체제의 기본 해석 순서로 JVM 의 해석 순서 맞추기
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100).order(ByteOrder.nativeOrder());
    }

}

/*
    결과
        운영체제 종류 : Mac OS X
        네이티브의 바이트 해석 순서 : LITTLE_ENDIAN
                               (뒤쪽부터 바이트 처리)
 */
