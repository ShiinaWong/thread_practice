package chapter3.test3111;

import chapter3.test313.Test2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String();
        P p = new P(lock);
        C c = new C(lock);
        ThreadP[] pThreads = new ThreadP[2];
        ThreadC[] cThreads = new ThreadC[2];
        for(int i=0;i<2;i++){
            pThreads[i] = new ThreadP(p);
            pThreads[i].setName("生产者" + i);
            cThreads[i] = new ThreadC(c);
            cThreads[i].setName("消费者" + i);
            pThreads[i].start();
            cThreads[i].start();
        }
        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for(int i=0;i<threads.length;i++){
            System.out.println(threads[i].getName()+" "+threads[i].getState());
        }
    }

}
