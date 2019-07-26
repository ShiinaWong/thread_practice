package chapter2;

import chapter2.threadEntity.MyThread7;

public class MainMethod3 {
    public static void main(String[] args) {
        try {
            MyThread7 myThread = new MyThread7();
            myThread.start();
            Thread.sleep(5000);
            System.out.println("A1= "+System.currentTimeMillis()+"  i="+myThread.getI());
            myThread.suspend();
            System.out.println("A2= "+System.currentTimeMillis()+"  i="+myThread.getI());
            Thread.sleep(5000);
            System.out.println("A3= "+System.currentTimeMillis()+"  i="+myThread.getI());

            myThread.resume();
            System.out.println("B= "+System.currentTimeMillis()+"  i="+myThread.getI());
            Thread.sleep(5000);
            System.out.println("B= "+System.currentTimeMillis()+"  i="+myThread.getI());


        } catch (InterruptedException e) {
            System.out.println("进入main中的了");
            e.printStackTrace();
        }
        System.out.println("thread end");
    }
}
