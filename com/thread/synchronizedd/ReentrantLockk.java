package com.thread.synchronizedd;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockk {

    static ReentrantLock lock = new ReentrantLock(true);
    public static int i = 0;

    public static class Thread1 extends Thread{
        @Override
        public void run() {
           lock.lock();
           try{
               i++;
               Thread.sleep(2000);

               // reentrantLock.getHoldCount
               // lock 은 hold count 를 통하여 lock 을 더 잠그거나 푸는데
               // 이 lock 의 hold count 를 반환한다.
               // deadLock check 을 할 때 유용할 것 같다.
               System.out.println(lock.getHoldCount());
           } catch (InterruptedException e) {
               e.printStackTrace();
           } finally {
               lock.unlock();
           }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        Thread1 thread3 = new Thread1();

        thread1.start();
        thread2.start();
        thread3.start();

        // lock.getQueueLength
        // lock 을 현제 기다리고 있는 queue 의 길이를 반환
        Thread.sleep(1000);
        System.out.println(lock.getQueueLength());

        // lock.isFair
        System.out.println(lock.isFair());

        lock.lock();

        // lock.isHeldByCurrentThread
        // 현제 쓰레드에서 lock 을 사용하고 있는지 확인
        System.out.println(lock.isHeldByCurrentThread());
        lock.unlock();

        // lock.isLocked
        // 락이 현제 잠겨있는지 확인
        System.out.println(lock.isLocked());
    }
}
