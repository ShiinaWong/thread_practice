package chapter2.test233;

public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值位false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
