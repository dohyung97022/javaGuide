package com.classStruct.capsulization;

public class Capsule {
    private int hour;
    private int minute;
    private int second;

    // 각각의 변수들을 public으로 지정하지 않고 setter로 지정하는 이유
    // 값들이 엉뚱한 값이 되지 않도록 보호하는 것이다.
    public void setHour(int hour) {
        if (hour >= 0 && hour < 24)
            this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 60)
            this.minute = minute;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 60)
            this.second = second;
    }
}
