package chapter3.tesst331;

public class Run {
    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if(t1.get() == null){
            System.out.println("从未释放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
