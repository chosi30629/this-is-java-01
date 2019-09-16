package _11_multi_thread.status_control_example.wait_notify;

// 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체
public class DataBox {
    private  String data;


    public synchronized String getData() {
        // data 필드가 null 이면 소비자 스레드를 일시 정지 상태로 만듦
        if (this.data == null) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        String returnValue = data;
        System.out.println("ConsummerThread 가 읽은 데이터: " + returnValue);
        // data 필드를 null 로 만들고 생산자 스레드를 실행 대기 상태로 만듦
        data = null;
        notify();
        return returnValue;
    }

    public synchronized void setData(String data) {
        // data 필드가 null 이 아니면 생산자 스레드를 일시 정지 상태로 만듦
        if (this.data != null) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        this.data = data;
        System.out.println("ProducerThread 가 생성한 데이터: " + data);
        // data 필드에 값을 저장하고 소비자 스레드를 실행 대기 상태로 만듦
        notify();
    }

}
