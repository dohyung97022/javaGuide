package com.variable;

public class OverFlow {
    public static void main(String[] args) {
        // -128 ~ 127의 overflow
        byte byteType = 127;
        byteType +=1;
        System.out.println(byteType);

        short shortType = 32767;
        shortType +=1;
        System.out.println(shortType);
        shortType -=1;
        System.out.println(shortType);

        char charType = 65535;
        charType +=1;
        System.out.println((int)charType);
    }
}
