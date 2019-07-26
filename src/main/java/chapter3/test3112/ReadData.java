package chapter3.test3112;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
    public void readMethod(PipedInputStream input){
        try {
            System.out.println("read:");
            byte[] bytes = new byte[20];
            int length = input.read(bytes);
            while (length != -1){
                String newData = new String(bytes,0,length);
                System.out.println(newData);
                length = input.read(bytes);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
