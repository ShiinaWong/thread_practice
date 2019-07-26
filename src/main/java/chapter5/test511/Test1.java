package chapter5.test511;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("当前时间为:"+new Date());
        Calendar calendarRef1 = Calendar.getInstance();
        calendarRef1.add(Calendar.SECOND,10);
        System.out.println("一号任务预计时间为："+ calendarRef1.getTime());
        Calendar calendarRef2 = Calendar.getInstance();
        calendarRef2.add(Calendar.SECOND,20);
        System.out.println("二号任务预计时间为："+ calendarRef2.getTime());
        Date runTime1 = calendarRef1.getTime();
        Date runTime2 = calendarRef2.getTime();

        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();


        Timer timer = new Timer();

        timer.schedule(task1,runTime1);
        timer.schedule(task2,runTime2);
    }
}
