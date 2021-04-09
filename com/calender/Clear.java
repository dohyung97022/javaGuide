package com.calender;

import java.util.Calendar;

public class Clear {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // 초 / 분 / 시간을 초기활 할 수 있다.
        calendar.clear(Calendar.SECOND);
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.HOUR_OF_DAY);
        calendar.clear(Calendar.HOUR);

        // 전체를 초기활 할 수 있다.
        // 이 경우 EPOCH Time 으로 초기화된다.
        calendar.clear();
    }
}
