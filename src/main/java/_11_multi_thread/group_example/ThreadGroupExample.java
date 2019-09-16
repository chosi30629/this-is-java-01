package _11_multi_thread.group_example;

public class ThreadGroupExample {

    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("[main 스레드 그룹의 list() 메소드 출력 내용]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        System.out.println("[myGroup 스레드 그룹의 interrupt() 메소드 호출]");
        myGroup.interrupt();
    }

}

/*
    결과
        [main 스레드 그룹의 list() 메소드 출력 내용]
        java.lang.ThreadGroup[name=main,maxpri=10]
            Thread[main,5,main]
            Thread[Monitor Ctrl-Break,5,main]
            java.lang.ThreadGroup[name=myGroup,maxpri=10]
                Thread[workThreadA,5,myGroup]
                Thread[workThreadB,5,myGroup]

        [myGroup 스레드 그룹의 interrupt() 메소드 호출]
        workThreadB interrupted
        workThreadB 종료됨
        workThreadA interrupted
        workThreadA 종료됨
 */
