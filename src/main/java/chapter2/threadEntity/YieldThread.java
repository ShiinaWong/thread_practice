package chapter2.threadEntity;

public class YieldThread extends Thread{
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        int count = 0;
        for(int i=0;i<5000000;i++){
            Thread.yield();
            count = count + i;
        }
        long end = System.currentTimeMillis();
        System.out.println("用时 " + (end-begin));

    }
}
