package chapter2.threadEntity;

public class MyThread4 extends Thread{
    @Override
    public void run() {
        try {
            for(int i=0;i<150000;i++){
                if(this.isInterrupted()){
                    System.out.println("是时候退出了");
                    throw new InterruptedException();
                }
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println("进入myThread中的catch方法了");
            e.printStackTrace();
        }
    }
}
