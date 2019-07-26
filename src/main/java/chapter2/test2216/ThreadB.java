package chapter2.test2216;

public class ThreadB extends Thread{
    private UserInfo userInfo;
    private Service service;
    public ThreadB(UserInfo userInfo, Service service){
        this.userInfo = userInfo;
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethod(userInfo);
    }
}
