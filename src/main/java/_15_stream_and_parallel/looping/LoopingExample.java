package _15_stream_and_parallel.looping;

import java.util.Arrays;

public class LoopingExample {

    /*
        peek() 은 중간 처리, 마지막에 최종 메소드가 와야 동작함
        forEach() 는 최종 처리, 마지막에 최종 메소드가 오면 안됨
     */
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        System.out.println("[peek()를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
            .filter(a -> a % 2 == 0)
            .peek(n -> System.out.println(n));  // 동작하지 않음

        System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n))   // 동작함
                .sum();// 최종 메소드
        System.out.println("총합: " + total);

        System.out.println("[forEach()를 마지막에 호출한 경우");
        Arrays.stream(intArr)
            .filter(a -> a % 2 == 0)
            .forEach(n -> System.out.println(n));   // 최종 메소드로 동작함
    }

}

/*
    결과
        [peek()를 마지막에 호출한 경우]
        [최종 처리 메소드를 마지막에 호출한 경우]
        2
        4
        총합: 6
        [forEach()를 마지막에 호출한 경우
        2
        4
 */