package chapter3.test3112;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream input = new PipedInputStream();
            PipedOutputStream out = new PipedOutputStream();
            input.connect(out);
            ThreadWrite threadWrite = new ThreadWrite(writeData,out);
            threadWrite.join();
            ThreadRead threadRead = new ThreadRead(readData,input);
            threadRead.start();
            Thread.sleep(2000);
            threadWrite.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
