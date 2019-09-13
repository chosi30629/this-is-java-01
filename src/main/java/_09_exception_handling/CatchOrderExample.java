package _09_exception_handling;

public class CatchOrderExample {

    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
        } catch (Exception e) {
            System.out.println("실행에 문제가 있습니다.");
        } finally {
            // 정상 및 예외 처리 시 그 다음 무조건 실행. return 이 있어도 실행
            System.out.println("다시 실행하세요.");
        }
    }

}

/*
    상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 한다.

    결과
        실행 매개값의 수가 부족합니다.
        다시 실행하세요.
 */
