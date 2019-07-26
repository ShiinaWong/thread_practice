package chapter2.threadEntity;

public class MyThread7 extends Thread{
    private long i = 0;

    @Override
    public void run() {
        while (true){
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
