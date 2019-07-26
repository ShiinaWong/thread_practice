package chapter5.test515;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test9 {
    static class MyTask extends TimerTask{
        @Override
        public void run() {
//            try {
                System.out.println("begin timer = "+ new Date());
//                Thread.sleep(5000);
                System.out.println("end timer = "+ new Date());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        System.out.println("现在执行时间"+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND,(calendar.get(Calendar.SECOND) - 20));
        Date runTime = calendar.getTime();
        System.out.println("计划执行时间"+ runTime);
        Timer timer = new Timer();
        timer.schedule(task,runTime,2000);
    }
}
