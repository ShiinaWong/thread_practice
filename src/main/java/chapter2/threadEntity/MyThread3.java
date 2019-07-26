package chapter2.threadEntity;

public class MyThread3 extends Thread{
    @Override
    public void run() {
            for(int i=0;i<150000;i++){
                if(this.isInterrupted()){
                    System.out.println("是时候退出了");
                    break;
                }
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(i);
            }
    }
}
