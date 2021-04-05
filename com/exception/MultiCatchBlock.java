package com.exception;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println(0/0);
            // 두가지 exception 안에서 같은 행동을 할 때 사용 가능
            // 다만 부모 자식이 | 사이에 사용되면 error 가 생긴다.
        } catch (ClassCastException | ArithmeticException e){
            e.printStackTrace();
        }
    }
}
