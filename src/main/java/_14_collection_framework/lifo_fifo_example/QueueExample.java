package _14_collection_framework.lifo_fifo_example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "조성일"));
        messageQueue.offer(new Message("sendKaKaoTalk", "김자바"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS 을 보냅니다.");
                    break;
                case "sendKaKaoTalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }

}

/*
    결과
        홍길동님에게 메일을 보냅니다.
        조성일님에게 SMS 을 보냅니다.
        김자바님에게 카카오톡을 보냅니다.
 */
