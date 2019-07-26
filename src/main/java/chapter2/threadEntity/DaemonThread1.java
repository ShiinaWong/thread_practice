package chapter2.threadEntity;

public class DaemonThread1 extends Thread {
    private int i = 0;
    @Override
    public void run() {
        while (true){
            try {
                i++;
                System.out.println(i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
