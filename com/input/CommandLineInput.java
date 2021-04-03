package com.input;

import java.util.Arrays;

public class CommandLineInput {
    // cd com/input
    // java CommandLineInput.java abc 123 "hello world"
    public static void main(String[] args) {
        System.out.println("매개변수의 개수 : "+args.length);
        System.out.println(Arrays.toString(args));
    }
}
