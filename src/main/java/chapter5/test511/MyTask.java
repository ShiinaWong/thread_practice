package chapter5.test511;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

    @Override
    public void run() {
        try {
            System.out.println("任务 begin:"+new Date());
            Thread.sleep(30000);
            System.out.println("任务 end:"+new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
