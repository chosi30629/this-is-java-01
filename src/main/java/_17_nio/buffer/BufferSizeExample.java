package _17_nio.buffer;

import java.nio.ByteBuffer;

public class BufferSizeExample {

    public static void main(String[] args) {
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(1000 * 1024 * 1024);
        System.out.println("다이렉트 버퍼가 생성되었습니다.");

        ByteBuffer nonDirectBuffer = ByteBuffer.allocate(1000 * 1024 * 1024);
        System.out.println("넌다이렉트 버퍼가 생성되었습니다.");
    }

}

/*
    책에서는 넌다이렉트 쪽에서 OutOfMemoryError 가 나지만
    내 환경에서는 크기를 조정해도 둘 다 생성됨
 */
