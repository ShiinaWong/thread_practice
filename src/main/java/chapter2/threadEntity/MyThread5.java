package chapter2.threadEntity;

public class MyThread5 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("myThread begin");
            sleep(20000);
            System.out.println("myThread end");
        } catch (InterruptedException e) {
            System.out.println("进入myThread中的catch方法了");
            e.printStackTrace();
        }   
    }
}
