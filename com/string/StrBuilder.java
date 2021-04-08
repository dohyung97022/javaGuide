package com.string;

public class StrBuilder {
    public static void main(String[] args) {

        // stringBuilder는 동기화가 되어 있지 않지만
        StringBuilder stringBuilder = new StringBuilder("abc");

        // stringBuffer는 동기화가 되어 있어 multi thread 에 유리하다.
        StringBuffer stringBuffer = new StringBuffer("abc");

        // 나머지는 모두 같다.
    }
}
