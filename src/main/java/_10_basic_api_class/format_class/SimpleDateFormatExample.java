package _10_basic_api_class.format_class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatExample {

    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("오늘은 E요일", Locale.KOREAN);
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(now));
    }

}

/*
    결과
        2019-09-15
        2019년 09월 15일
        2019.09.15 PM 15:57:42
        오늘은 Sun요일
        오늘은 일요일
        올해의 258번째 날
        이달의 15번째 날
 */