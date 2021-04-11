package com.thread;

public class Threadd {
    // 구현하는 방법 2가지

    // extends Thread
    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.print(0);
            }
        }
    }
    // implements Runnable
    static class MyThread2 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.print(1);
            }
        }
    }

    public static void main(String[] args) {
        // 부모 클래스로 생성한 경우
        MyThread myThread = new MyThread();


        // 인터페이스로 생성하는 경우
        Runnable myRunnable = new MyThread2();
        Thread myThread2 = new Thread(myRunnable);


        myThread.start();
        myThread2.start();
    }
}
