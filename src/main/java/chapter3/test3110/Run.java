package chapter3.test3110;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
        threadSubtract1.setName("threadSubtract111111");
        threadSubtract1.start();
        ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
        threadSubtract2.setName("threadSubtract222222");
        threadSubtract2.start();
        Thread.sleep(1000);
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.start();
    }
}
