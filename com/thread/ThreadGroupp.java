package com.thread;

public class ThreadGroupp {

    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.print(0);
            }
        }

        public MyThread(ThreadGroup group, String name) {
            super(group, name);
        }
    }

    public static void main(String[] args) {
        ThreadGroup parentGroup = new ThreadGroup("parentGroup");
        ThreadGroup threadGroup1 = new ThreadGroup(parentGroup,"threadGroup1");

        MyThread myThread = new MyThread(threadGroup1, "myThread");
        MyThread myThread1 = new MyThread(threadGroup1, "myThread1");

        myThread.start();
        myThread1.start();

        // thread.getThreadGroup
        // 쓰레드가 포함되어 있는 그룹을 출력해준다.
        System.out.println(myThread.getThreadGroup());

        // threadGroup.getName
        // 그룹의 이름을 가져온다.
        System.out.println(threadGroup1.getName());

        // threadGroup.getMaxPriority
        // 그룹의 하위 쓰레드들의 최고 우선순위를 가져온다.
        System.out.println(threadGroup1.getMaxPriority());

        // threadGroup.activeCount
        // 그룹이 포함하고 있는 쓰레드를 세어준다.
        System.out.println(threadGroup1.activeCount());

        // threadGroup.activeGroupCount
        // 쓰레드의 그룹이 포함하고 있는 그룹을 세어준다.
        System.out.println(parentGroup.activeGroupCount());

        // threadGroup.setDaemon
        // 쓰레드의 그룹을 데몬으로 지정한다.
        threadGroup1.setDaemon(true);

        // threadGroup.isDaemon
        // 쓰레드의 그룹이 데몬인지 확인한다.
        System.out.println(threadGroup1.isDaemon());

        // threadGroup.interrupt
        // 쓰레드를 중간에 가로첸다.
        // 이 코드가 돌아가는동안 쓰레드 그룹 잠시 멈춤.
        threadGroup1.interrupt();

        // threadGroup.destroy
        // 쓰레드의 하위쓰레드들도 모두 정지한다.
        threadGroup1.destroy();

        // threadGroup.isDestroyed
        // 쓰레드가 정지되어 있는지 확인한다.
        System.out.println(threadGroup1.isDestroyed());
    }
}
