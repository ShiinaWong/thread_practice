package chapter3.test332;

public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for(int i=0;i<100;i++){
                Tools.t1.set("threadA "+(i+1));
                System.out.println("threadA get Value = "+Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
