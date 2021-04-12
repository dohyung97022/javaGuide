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


        // 잠시 쓰레드를 정지하고 코드를 실행한다.
        myThread.interrupt();

        // 쓰레드가 끝날 때까지 기다린다.
        try{
            myThread.join();
        }catch (InterruptedException e){
        }

        // 쓰레드의 현제 상태를 알 수 있다.
        System.out.println(myThread.getState());
        // Thread.State.NEW
        // 쓰레드가 생성되고 아직 호출되지 않은 상태
        // Thread.State.RUNNABLE
        // 실행 중인 또는 실행 가능한 상태
        // Thread.State.BLOCKED
        // 동기화블럭에 의해 일시정지된 상태
        // Thread.State.WAITING
        // 쓰레드가 실행중이지 않지만 줄을 서서 기다리는 상태
        // Thread.State.TIMED_WAITING
        // 일시정지시간이 지정된 상태
        // Thread.State.TERMINATED
        // 작업이 종료된 상태

        // 쓰레드를 일시정지, 재귀시키는 방법

        // 시간을 지정하면 그만큼 기다리고
        // 지정하지 않으면 아예 멈춤의 상태가 된다.
        // myThread.sleep();
        // myThread.interrupt();

        // wait 과 notify 는 각 쓰레드들 간의
        // 통신을 위해서 사용할 수 있다.
        Object object = new Object();
        synchronized (object){
            try {
                object.wait(10);
                object.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
