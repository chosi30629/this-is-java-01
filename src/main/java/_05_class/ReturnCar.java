package _05_class;

public class ReturnCar {
    int gas;


    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas 가 없습니다.");
            return false;
        }
        System.out.println("gas 가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas 잔량: " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas 잔량: " + gas + ")");
                return; // 반환값 없는 메소드 실행 종료. 만약 while 문 뒤에 실행 문이 추가적으로 더 있을 경우 break 문을 반드시 사용
            }
        }
    }

}
