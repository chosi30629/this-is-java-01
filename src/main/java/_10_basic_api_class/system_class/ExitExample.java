package _10_basic_api_class.system_class;

public class ExitExample {

    public static void main(String[] args) {
        // 보안 관리자 설정
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkExit(int status) {
                if (status != 5) {
                    throw new SecurityException();
                }
            }
        });

        for(int i = 0; i < 10; i++) {
            System.out.println(i);

            try {
                // JVM 종료 요청
                System.exit(i);
            } catch (SecurityException e) {}
        }
    }

}

/*
    System.exit() 이 실행되면 보안 관리자의 checkExit() 메소드가 자동 호출됨
    결과
        0
        1
        2
        3
        4
        5
 */