package com.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) throws ParseException {
        // date str 으로 변경할 수 있다.
        // format
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일");
        String format = sdf.format(today);

        System.out.println(format);

        // str 에서 date 로 변경이 가능하다.
        // parse
        Date today2 = sdf.parse(format);
        System.out.println(today2.toString());

        /* G - 연대 AD/DC
         * y - 연도 2007
         * M - 월 10
         * w - 년의 몇 번째 주 50
         * W - 월의 몇 번째 주
         * D - 년의 몇 번째 일 100
         * d - 월의 몇 번째 일 1~31
         * F - 월의 몇 번째 요일 1~5
         * E - 요일 월~일
         * a - 오전 오후 AM/PM
         * H - 시간 0~23
         * h - 시간 1~12
         * m - 분 0~59
         * s - 초 0~59
         * S - 천분의 일초 0~999
         * z - Time zone(GTZ) GMT+9:00
         * Z - Time zone(RFC) +0900
         */
    }
}
