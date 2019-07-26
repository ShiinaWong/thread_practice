package chapter2.test234;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread{
    private static AtomicInteger count = new AtomicInteger(0);
    private static void addCount(){
        for (int i=0;i<100;i++){
            System.out.println(count.incrementAndGet());
        }
        System.out.println("count = "+count);
    }

    @Override
    public void run() {
        addCount();
    }
}
