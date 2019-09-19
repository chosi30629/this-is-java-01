package _14_collection_framework.sync_parallel_example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Example {

    /*
    Vector 와 Hashtable 은 동기화된 메소드로 구성되어 있지만 나머지는 동기화된 메소드로 구성되어 있지 않다.
    멀티 스레드 환경에서 안전하지 않음
     */
    public static void main(String[] args) {
        // 비동기 컬렉션을 동기화
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        Map<String, String> map = Collections.synchronizedMap(new HashMap<>());

        // 병렬 처리를 위한 컬렉션
        Map<String, String> _map = new ConcurrentHashMap<>();
        Queue<String> queue = new ConcurrentLinkedQueue<>();
    }

}
