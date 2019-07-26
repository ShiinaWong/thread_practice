package chapter2.threadEntity;

public class MyThread6 extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0;i<500000;i++){
                System.out.println(i);
            }
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("进入myThread中的catch方法了");
            e.printStackTrace();
        }   
    }
}
