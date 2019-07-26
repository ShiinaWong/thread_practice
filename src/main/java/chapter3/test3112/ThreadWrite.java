package chapter3.test3112;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedOutputStream out;
    public ThreadWrite (WriteData writeData,PipedOutputStream out){
        this.out = out;
        this.writeData = writeData;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
