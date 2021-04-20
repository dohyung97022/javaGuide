package com.thread.synchronizedd;

public class Synchronizedd {
    static class Account {
        private Integer balance = 1000;

        public int getBalance() {
            return balance;
        }

        // synchronized method
        // 이 경우 동기화는 클래스의 객체에 일어난 것이지
        // function 에서 동기화 된 것이 아니다.
        // this 에 동기화를 거는 것과 같다.
        public synchronized void withdraw (int money){
            if (balance >= money)
                balance -= money;
        }

        // synchronized block
        public void withdraw2 (int money){
            synchronized (balance){
                if (balance >= money)
                    balance -= money;
            }
        }

        // wait
        public void waiting() throws InterruptedException {
            synchronized (this){
                wait();
                System.out.println("wait is notified");
            }
        }

        // notify
        public void notifying(){
            synchronized (this){
                notify();
            }
        }
    }

    // runnable thread 생성
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

    // 쓰레드 돌리기
    public static void main(String[] args) {
        Runnable runnable = new Thread1();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread.start();
        thread1.start();
    }
}
