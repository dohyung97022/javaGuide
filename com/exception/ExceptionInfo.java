package com.exception;

public class ExceptionInfo {
    public static void main(String[] args) {
        try{
            System.out.println(0/0);
        }
        catch(Exception e){

            // printStackTrace()
            // 예외가 발생한 라인을 출력해준다.
            e.printStackTrace();

            // .getMessage()
            // 에러의 메세지만을 받는다.
            System.out.println(e.getMessage());
        }
    }
}
