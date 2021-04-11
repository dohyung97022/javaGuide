package com.thread;

public class MainAndDemonThread {

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
        Threadd.MyThread myThread = new Threadd.MyThread();


        // 인터페이스로 생성하는 경우
        Runnable myRunnable = new Threadd.MyThread2();
        Thread myThread2 = new Thread(myRunnable);


        myThread.start();
        myThread2.start();

        // join 이란 해당 쓰레드가 종료될 때까지 기다리는 것이다.
//        try{
//            myThread.join();
//            myThread2.join();
//        } catch (InterruptedException e){
//            e.getStackTrace();
//        }

        System.out.println("main 쓰레드가 종료됩니다.");
    }
}
