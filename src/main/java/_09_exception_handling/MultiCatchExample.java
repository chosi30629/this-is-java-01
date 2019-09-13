package _09_exception_handling;

public class MultiCatchExample {

    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);

        // || 두개는 안됨. 타입은 여러개, 매개변수는 하나
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
        } catch (Exception e) {
            System.out.println("실행에 문제가 있습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }

}

/*
     결과
        실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.
        다시 실행하세요.
 */