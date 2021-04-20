package com.thread;

public class Daemon {
    static class Thread1 extends Thread{
        @Override
        public void run() {

            // usage
            // 데몬 쓰레드는 주로 특정 조건이
            // 만족되는지 확인하는데 쓰인다.
            while (true)
                System.out.println(1);
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread1();

        // 데몬으로 지정된다면 main thread 가 정지되기에
        // 바로 정지가 되어버린다.

        // setDaemon
        // setDaemon 은 반드시 start 이전에 호출하자.
        thread1.setDaemon(true);

        thread1.start();
    }
}
