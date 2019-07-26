package chapter6.test62;

public class MyObject {
    private volatile static MyObject object;
    private MyObject(){

    }
    public  static MyObject getInstance(){
        try {
            if(object != null){

            }else{
                Thread.sleep(5000);
                synchronized (MyObject.class){
                    if(object == null) object = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
