package chapter2.test2216;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        UserInfo userInfo = new UserInfo();
        ThreadA a = new ThreadA(userInfo,service);
        a.setName("AAA");
        a.start();
        Thread.sleep(50);
        ThreadB b = new ThreadB(userInfo,service);
        b.setName("BBB");
        b.start();
    }
}
