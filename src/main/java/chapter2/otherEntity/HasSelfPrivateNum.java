package chapter2.otherEntity;

public class HasSelfPrivateNum {
    private int num = 0;
    public void addI (String name){
        try {
            if("a".equals(name)){
                num = 100;
                System.out.println("set A over");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("set B over");
            }
            System.out.println(name + " num = " +num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
