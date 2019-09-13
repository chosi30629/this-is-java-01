package _09_exception_handling.auto_close_custom_example;

/*
    자동 리소스 닫기를 사용하기 위해서는 조건이 있는데, 리소스 객체는 java.lang.AutoClose 인터페이스를 구현하고 있는 객체여야한다.
    이 예제는 커스텀
    구현 객체는 API 참조
 */
public class FileInputStream implements AutoCloseable {
    private String file;


    public FileInputStream(String file) {
        this.file = file;
    }

    public void read() {
        System.out.println(file + "을 읽습니다.");
    }

    @Override
    public void close() throws Exception {
        System.out.println(file + "을 닫습니다.");
    }

}
