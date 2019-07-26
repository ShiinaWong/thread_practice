package chapter2.threadEntity;

public class MyThread8 extends Thread{
    private long i = 0;

    @Override
    public void run() {
        while (!isInterrupted()){
            System.out.println(i);
            i++;
        }
    }

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }
}
