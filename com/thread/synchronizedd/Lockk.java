package com.thread.synchronizedd;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lockk {

    // ReentrantLock
    // 주로 사용되는 lock
    // 다양하고 다른 thread 에서도 이 lock 을 접근할 수 있다는
    // 의미로서의 reentrantLock 이다.

    // Starvation 이란 특정 쓰레드가 자신의 차례를 받지 못하고 기다리는 것을 의미한다.
    // fairness 를 보장하기 위해서는 true 를 추가하자.
    static Lock lock = new ReentrantLock(true);
    static int count = 0;

    public static class thread1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                // deadLock example
                // 동일 임계구역에 lock.lock 이 두번 불리면
                // deadLock 이 된다.
                lock.lock();
                try {
                    lock.lock();
                } finally {
                    lock.unlock();
                }

                // lock.lock
                // lock 의 hold count 가 0 이라면
                // lock 의 hold count 를 1 늘리고 진행한다.
                lock.lock();
                try {
                    count++;
                    System.out.println(count);
                } finally {
                    // lock.unlock
                    // lock 의 hold count 를 1 줄인다.
                    lock.unlock();
                }

                // lock.tryLock
                // lock 의 if bool 버전
                // lock 안된다면 그냥 else 를 진행
                // timeUnit 과 기다리는 시간을 지정할 수 있다.
                 if (lock.tryLock()){
                     try {
                         count++;
                         System.out.println(count);
                     } finally {
                         lock.unlock();
                     }
                 } else {
                     System.out.println("The lock is occupied");
                 }

                 // lock.lockInterruptibility
                 // interrupt 가 가능한 lock 을 만든다.
                 // interrupt 가 된다면 catch 된다.
                 // java.lang.InterruptedException
                 try {
                     lock.lockInterruptibly();
                     lock.unlock();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
            }
        }
    }

    public static void main(String[] args) {
        thread1 thread1 = new thread1();
        Lockk.thread1 thread2 = new thread1();
        thread1.start();
        thread2.start();
    }
}
