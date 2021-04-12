package com.thread;

public class Synchronizedd {
    static class Account {
        private int balance = 1000;

        public int getBalance() {
            return balance;
        }

        // 임계 영역은 단 1개의 스레드만 들어갈 수 있다.
        // 충돌을 막아 오류를 줄여준다.
        public synchronized void withdraw (int money){
            if (balance >= money)
                balance -= money;
        }
    }

    static class Thread1 implements Runnable{
        Account account = new Account();
        @Override
        public void run() {
            while (account.getBalance() > 0){
                int money = (int)(Math.random() * 3 + 1) * 100;
                account.withdraw(money);
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
                System.out.println("balance : " + account.getBalance());
            }
        }
    }
    public static void main(String[] args) {
        Runnable runnable = new Thread1();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread.start();
        thread1.start();
    }
}
