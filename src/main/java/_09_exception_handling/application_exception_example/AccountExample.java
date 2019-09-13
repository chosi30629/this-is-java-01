package _09_exception_handling.application_exception_example;

public class AccountExample {

    public static void main(String[] args) {
        Account account = new Account();

        // 예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(30000);
        } catch (BalanceInsufficientException e) {
            String message = e.getMessage();    // 예외 메시지 얻기
            System.out.println(message);
            System.out.println();
            e.printStackTrace();                // 예외 추적 후 출력(흔적을 쌓다.)
        }
    }

}

/*
    결과
        예금액: 10000
        잔고부족: 20000 모자람

        _09_exception_handling.application_exception_example.BalanceInsufficientException: 잔고부족: 20000 모자람
            at _09_exception_handling.application_exception_example.Account.withdraw(Account.java:22) *** 최초 예외 발생
            at _09_exception_handling.application_exception_example.AccountExample.main(AccountExample.java:14) *** 떠넘겨짐

            - 예외 메시지 뒷 부분의 *** 로 시작하는 주석은 내가 작성함
 */