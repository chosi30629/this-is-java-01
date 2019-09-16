package _11_multi_thread.priority_example;

public class PriorityExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new CalcThread("thread" + i);
            if (i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }

}

/*
    우선순위 스레드 예제인데 예상치 않은 결과가 나옴
        - https://docs.oracle.com/cd/E13188_01/jrockit/docs142/devapp/codeprac.html#998533
        - java.lang.Thread.setPriority.
          스케줄링 알고리즘이 CPU 시간의 우선 순위가 낮은 스레드를 고갈시키고 절대 실행하지 않기 때문에 스레드 우선 순위에 따라 원치 않거나 예기치 않은 결과가 발생할 수 있습니다.
          또한 결과는 운영 체제와 JVM 마다 다를 수 있습니다.
          Java API 사양에서는 모든 스레드에 우선 순위가 있습니다.
          우선 순위가 높은 스레드가 우선 순위가 낮은 스레드보다 우선적으로 실행됩니다.
          setPriority()메소드에 의해 설정된 우선 순위 는 스레드 스케줄링 알고리즘에서 사용될 수 있는 매개 변수로, 실행 스레드간에 CPU 실행 시간을 공유합니다.
          이 알고리즘은 JVM 또는 운영 체제에 의해 제어 될 수 있습니다.
          이 알고리즘은 일반적으로 운영 체제마다 다르며 운영 체제와 JVM 릴리스간에 알고리즘이 변경 될 수 있다는 사실을 알고 있어야합니다.
          BEA JRockit JVM 기본 스레드의 경우 알고리즘은 운영 체제에 의해 구현됩니다.
 */