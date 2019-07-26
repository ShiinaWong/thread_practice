package chapter2.threadEntity;

public class MyThread1 extends Thread{
    public MyThread1(){
        System.out.println("main? run threadName="+this.currentThread().getName()+" start");
    }
    @Override
    public void run() {
        try {
            System.out.println("run threadName="+this.currentThread().getName()+" start");
            System.out.println("run thread's id = "+Thread.currentThread().getId());
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+" end");
            System.out.println("Thread.currentThread().getName()="
                    +Thread.currentThread().getName());
            System.out.println("this.getName()="+this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
