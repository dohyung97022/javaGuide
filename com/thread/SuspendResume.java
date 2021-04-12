package com.thread;

public class SuspendResume {
    public static class MyThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.print("1");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        thread1.start();

        // 스레드를 일시정지한다.
        thread1.suspend();
        Thread.sleep(2000);
        // 일시정지된 스레드를 다시 돌린다.
        thread1.resume();
    }
}
