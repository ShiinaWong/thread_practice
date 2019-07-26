package chapter5.test515;

import chapter3.test3111.test05.C;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test1 {
    static class MyTask extends TimerTask{
        @Override
        public void run() {
            try {
                System.out.println("begin timer = "+ System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("end timer = "+ System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Calendar calendar = Calendar.getInstance();
        Date runTime = calendar.getTime();
        Timer timer = new Timer();
        timer.schedule(task,runTime,3000);
    }
}
