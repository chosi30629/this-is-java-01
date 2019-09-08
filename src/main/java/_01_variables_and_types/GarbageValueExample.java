package _01_variables_and_types;

public class GarbageValueExample {

    public static void main(String[] args) {
        byte var1 = 125;
        int var2 = 125;
//        byte var3 = 128; 컴파일 에러

        for (int i = 0; i < 5; i++) {
            var1++;
            var2++;
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        }
    }

}

/*
    실행 중에 저장할 수 있는 값의 범위를 초과하면 최소값부터 다시 반복 저장된다.

    결과
        var1: 126	var2: 126
        var1: 127	var2: 127
        var1: -128	var2: 128
        var1: -127	var2: 129
        var1: -126	var2: 130
 */