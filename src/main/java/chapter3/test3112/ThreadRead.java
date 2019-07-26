package chapter3.test3112;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream input;
    public ThreadRead(ReadData readData, PipedInputStream input){
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run() {
        readData.readMethod(input);
    }
}
