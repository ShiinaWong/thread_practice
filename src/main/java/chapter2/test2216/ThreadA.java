package chapter2.test2216;

public class ThreadA extends Thread{
    private UserInfo userInfo;
    private Service service;
    public ThreadA(UserInfo userInfo,Service service){
        this.userInfo = userInfo;
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethod(userInfo);
    }
}
