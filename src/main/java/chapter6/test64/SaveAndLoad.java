package chapter6.test64;

import java.io.*;

public class SaveAndLoad {
    public static void main(String[] args) {
        try {
            MyObject object = MyObject.getInstance();
            FileOutputStream fileOutputStream =
                    new FileOutputStream( new File("mytest.txt"));
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println(object.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("mytest.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MyObject myObject = (MyObject)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
