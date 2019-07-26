package chapter2.threadEntity;

import chapter2.otherEntity.MyList;

public class ListThreadA extends Thread{
    private MyList list ;

    public ListThreadA(MyList list){
        this.list = list;
    }

    @Override
    public void run() {
        for(int i=0;i<100000;i++){
            list.add("threadA"+(i=1));
        }
    }
}
