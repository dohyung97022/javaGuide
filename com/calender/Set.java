package com.calender;

import java.util.Calendar;

public class Set {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();

        // set 은 년월일 또는 년월일시분초 또는 parameter value 로 지정할 수 있다.
        // 월은 1을 빼는 것을 절대로 잊지 말도록 하자.
        // 또는 Calender.JANUARY 같이 바꿔줘도 된다.
        calender.set(2019,3,1,10,59,59);
        calender.set(2019,3,1);
        calender.set(Calendar.DATE, 10);

        // 시간
        calender.set(Calendar.HOUR_OF_DAY,10);
        // 분
        calender.set(Calendar.MINUTE,59);
        // 초
        calender.set(Calendar.SECOND,59);
    }
}
