package _16_io.assistance_stream;

import java.util.Date;

public class PrintfExample {

    public static void main(String[] args) {
        System.out.printf("상품의 가격: %d원\n", 123);
        System.out.printf("상품의 가격: %6d원\n", 123);
        System.out.printf("상품의 가격: %-6d원\n", 123);
        System.out.printf("상품의 가격: %06d원\n", 123);

        System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, Math.PI * 10 * 10);

        System.out.printf("%6d | %-10s | %10s\n", 1, "홍길동", "도적");

        Date now = new Date();
        System.out.printf("오늘은 %tY년 %tm월 %td일 입니다\n", now, now, now);
        System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다\n", now);
        System.out.printf("현재 %1$tH시 %1$tM분 %1$tS초 입니다\n", now);
    }

}

/*
    결과
        상품의 가격: 123원
        상품의 가격:    123원
        상품의 가격: 123   원
        상품의 가격: 000123원
        반지름이 10인 원의 넓이:     314.16
             1 | 홍길동        |         도적
        오늘은 2019년 09월 22일 입니다
        오늘은 2019년 09월 22일 입니다
        현재 15시 52분 29초 입니다
 */