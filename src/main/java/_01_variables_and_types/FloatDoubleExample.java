package _01_variables_and_types;

public class FloatDoubleExample {

    public static void main(String[] args) {
        // 실수값 저장
        double var1 = 3.14;
//        float var2 = 3.14; 컴파일 에러
        float var3 = 3.14F;

        // 정밀도 테스트
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;

        System.out.println("var1: " + var1);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);

        // e 사용하기
        int var6 = 3000000;
        double var7 = 3e6;
//        float var8 = 3e6;   컴파일 에러
        float var8 = 3e6F;
        double var9 = 2e-3;
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
        System.out.println("var9: " + var9);

        double var10 = 10;
        float var11 = 10;
        System.out.println("var10: " + var10);
        System.out.println("var11: " + var11);
    }

}

/*
    결과
        var1: 3.14
        var3: 3.14
        var4: 0.12345678901234568
        var5: 0.12345679
        var6: 3000000
        var7: 3000000.0
        var8: 3000000.0
        var9: 0.002
        var10: 10.0
        var11: 10.0
 */
