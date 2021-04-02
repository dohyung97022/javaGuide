package com.scanner;

import java.util.Scanner;

public class ScanInput {
    public static void main(String[] args) {
        // scanner의 생성
        Scanner scanner = new Scanner(System.in);

        // scanner의 사용
        // int
        int num = scanner.nextInt();
        // String
        String string = scanner.nextLine();
    }
}
