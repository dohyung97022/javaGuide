package com.calender;

import java.util.Calendar;

public class AddRoll {
    public static void main(String[] args) {
        // add 와 roll 모두 특정 필드의 값을 증가 또는 감소시킨다.

        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2020,7,31);

        // add 의 경우 다른 필드에 영향을 미친다.
        // 31일 이상 더하면 월이 +1 된다.
        calendar.add(Calendar.DATE, 1);
        calendar.add(Calendar.MONTH, -8);

        System.out.println(calendar.toString());

        // roll 의 경우 다른 필드에 영향을 미치지 않는다.
        // 일이 아무리 변해도 월에 영향을 미치지 못한다.
        calendar.roll(Calendar.DATE, 1);
        calendar.roll(Calendar.MONTH, 10);

        System.out.println(calendar.toString());
    }
}
