package _09_exception_handling.auto_close_custom_example;

public class TryWithResourceExample {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt");) {
//             FileInputStream fis2 = new FileInputStream("file.txt")) {    여러개 일 경우
            fis.read();
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }
    }

}

/*
    결과
        file.txt을 읽습니다.
        file.txt을 닫습니다.
        예외 처리 코드가 실행되었습니다.
 */