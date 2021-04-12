package com.thread;

public class Daemon {
    static class Thread1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(1);
            }
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread1();

        // 데몬으로 지정된다면 main thread 가 정지되기에
        // 바로 정지가 되어버린다.
        thread1.setDaemon(true);

        thread1.start();
        // 이렇듯 쓰레드 그룹, 상위 그룹이 정지되면
        // 데몬 쓰레드는 자동으로 정지된다.
    }
}
