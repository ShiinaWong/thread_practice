package chapter2.test231;

public class Run {
    public static void main(String[] args) {
        PrintString printStringServie = new PrintString();
        new Thread(printStringServie).start();
//        printStringServie.printStringMethod();
        System.out.println("我要停止他。threadName = "+Thread.currentThread().getName());
        printStringServie.setContinuePrint(false);
    }
}
