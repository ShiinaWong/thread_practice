package chapter5.test513;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run extends TimerTask {
    @Override
    public void run() {
        System.out.println("运行时间为:" + new Date());
    }

    public static void main(String[] args) {
        Run run = new Run();
        Timer timer = new Timer();
        System.out.println("当前时间为："+new Date());
        timer.schedule(run,3000,5000);
    }
}
