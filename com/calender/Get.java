package com.calender;

import java.util.Calendar;
import java.util.Date;

public class Get {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // 현제 년도/날짜를 가져온다. 다양한 정보를 가져올 수 있다.
        int thisYear = calendar.get(Calendar.YEAR);
        int thisDate = calendar.get(Calendar.DATE);
        System.out.println(thisYear);
        System.out.println(thisDate);

        // 요일을 구하는 방법은
        int ary = calendar.get(Calendar.DAY_OF_WEEK);

        // GMT 기준으로 한국은 8시간이 더 빠르다.
        // ZONE_OFFSET 을 통하여 얻을 수 있다.
        int thisGmt = calendar.get(Calendar.ZONE_OFFSET);

        // 특정 달의 마지막 날을 구하는 방법은
        int lastDateOfMonth = calendar.getActualMaximum(Calendar.DATE);


        // calendar 를 date 로 변경하는 방법
        Date date = new Date(calendar.getTimeInMillis());
    }
}
