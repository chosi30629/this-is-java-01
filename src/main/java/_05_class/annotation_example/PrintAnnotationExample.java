package _05_class.annotation_example;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

    public static void main(String[] args) {
        // PrintService 클래스로부터 메소드 정보를 얻음
        Method[] declareMethods = PrintService.class.getDeclaredMethods();  // PrintService 에 선언된 메소드 얻기(리플렉션)

        // Method 객체를 하나씩 처리
        for (Method method : declareMethods) {
            // PrintAnnotation 이 적용되었는지 확인
            if (method.isAnnotationPresent(PrintAnnotation.class)) {
                // PrintAnnotation 객체 얻기
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                // 메소드 이름 출력
                System.out.println("[" + method.getName() + "]");

                // 구분선 출력
                for(int i = 0; i < printAnnotation.number(); i++) {
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                try {
                    // PrintService 객체를 생성하고 생성된 PrintService 객체의 메소드를 호출
                    method.invoke(new PrintService());
                } catch (Exception e) {
                    System.out.println();
                }
            }
        }
    }

}

/*
    결과
        [method1]
        ---------------
        실행 내용1
        [method2]
        ***************
        실행 내용2
        [method3]
        ####################
        실행 내용3
 */