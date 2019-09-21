package _15_stream_and_parallel.parallel;

import java.util.ArrayList;
import java.util.List;

public class ArrayListVsLinkedListExample {

    // 요소 처리
    public static void work(int value) {
    }

    // 병렬 처리
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().parallel().forEach(a -> work(a));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }

    public static void main(String[] args) {
        // 소스 컬렉션
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // 워밍업
        long arrayListParallel = testParallel(arrayList);
        long linkedListParallel = testParallel(linkedList);

        // 병렬 스트림 처리 시간 구하기
        arrayListParallel = testParallel(arrayList);
        linkedListParallel = testParallel(linkedList);

        System.out.println(arrayListParallel);
        System.out.println(linkedListParallel);
    }

}

/*
    결과
        1000509
        935646
 */
