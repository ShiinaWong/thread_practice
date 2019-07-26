package chapter2.threadEntity;

public class DaemonThread2 extends Thread {
    private int i = 0;
    @Override
    public void run() {
        while (true){
            try {
                i++;
                System.out.println(i);
                Thread.sleep(511);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
