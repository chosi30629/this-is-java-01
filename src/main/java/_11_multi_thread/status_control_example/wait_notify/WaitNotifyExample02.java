package _11_multi_thread.status_control_example.wait_notify;

public class WaitNotifyExample02 {

    public static void main(String[] args) {
        DataBox dataBox = new DataBox();

        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);

        producerThread.start();
        consumerThread.start();
    }

}

/*
    결과
        ProducerThread 가 생성한 데이터: Data-1
        ConsummerThread 가 읽은 데이터: Data-1
        ProducerThread 가 생성한 데이터: Data-2
        ConsummerThread 가 읽은 데이터: Data-2
        ProducerThread 가 생성한 데이터: Data-3
        ConsummerThread 가 읽은 데이터: Data-3
 */
