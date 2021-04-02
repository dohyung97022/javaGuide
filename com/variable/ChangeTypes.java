package com.variable;

public class ChangeTypes {
    public static void main(String[] args) {
        // char -> int
        char charType = '3';
        int intType = charType - '0';

        // int -> char
        charType = (char)(intType + '0');

        // int -> string
        String stringType = intType + "";

        // string -> int
        intType = Integer.parseInt(stringType);

        // char -> String
        stringType = charType + "";

        // String -> char
        charType = stringType.charAt(0);

        // String -> double
        double doubleType = Double.parseDouble(stringType);

        // double -> String
        stringType = doubleType + "";
    }
}
