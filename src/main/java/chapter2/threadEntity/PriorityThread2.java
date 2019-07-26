package chapter2.threadEntity;

import java.util.Random;

public class PriorityThread2 extends Thread{
    private long count;
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        for(int i=0;i<100;i++){
            for (int j=0;j<100000;j++){
                Random random = new Random();
                random.nextInt();
                count = count + i;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("+++++"+(end-begin)+"+++++");
    }
}
