package com.format;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DeciFormat {
    public static void main(String[] args) throws ParseException {
        // 숫자를 형식화할 때 사용할 수 있다.
        // .format
        double db = 1234567.89;
        DecimalFormat df = new DecimalFormat("#,###.##");
        System.out.println(df.format(db));

        // 형식의 문자열을 숫자로 변활할 때 사용할 수 있다.
        // .parse
        String str = "1,234,567.89";
        df = new DecimalFormat("#,###.##");
        Number number = df.parse(str);
        System.out.println(number.doubleValue());


        // #,###.## 말고도 수많은 format 이 존재한다.
    }
}
