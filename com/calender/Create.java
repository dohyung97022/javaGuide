package com.calender;

import java.util.Calendar;

public class Create {
    public static void main(String[] args) {
        // 생성하는 방법이 생성자가 아니다.
        // 컴퓨터에서부터 필요한 달력 형태 /서양력/동양력/일본력/ 등을 가져온다.
        // 또한 calender 는 추상 클래스 이기 때문에 생성자가 없다.
        // calendar 가 getInstance 되면 현제 시간과 날짜를 가져온다.
        Calendar calendar = Calendar.getInstance();
    }
}
