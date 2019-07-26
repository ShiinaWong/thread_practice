package chapter6.test64;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;

    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }

    private MyObject(){
    }

    public static MyObject getInstance(){
        return  MyObjectHandler.myObject;
    }

//    @Override
    protected Object readSolve() throws ObjectStreamException {
        System.out.println("调用了 readSolve 方法");
        return MyObjectHandler.myObject;
    }
}
