package _10_basic_api_class.date_calendar_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);
    }

}

/*
    결과
        Sun Sep 15 14:16:02 KST 2019
        2019년 09월 15일 02시 16분 02초
 */