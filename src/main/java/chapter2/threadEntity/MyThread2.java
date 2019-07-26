package chapter2.threadEntity;

public class MyThread2 extends Thread{
    @Override
    public void run() {
//        try {
            for(int i=0;i<150000;i++){
                System.out.println(i);
//                Thread.sleep(1);
            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
