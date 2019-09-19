package _15_stream_and_parallel.pipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
            new Member("홍길동", Member.MAIL, 30),
            new Member("에이다", Member.FEMAIL, 20),
            new Member("김자바", Member.MAIL, 45),
            new Member("수미킴", Member.FEMAIL, 27)
        );

        double ageAvg = list.stream()
            .filter(m -> m.getGender() == Member.MAIL)
            .mapToInt(Member :: getAge)
            .average()
            .getAsDouble();

        System.out.println("남자 평균 나이: " + ageAvg);
    }

}

/*
    결과
        남자 평균 나이: 37.5
 */