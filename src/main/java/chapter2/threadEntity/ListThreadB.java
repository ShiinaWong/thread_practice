package chapter2.threadEntity;

import chapter2.otherEntity.MyList;

public class ListThreadB extends Thread{
    private MyList list ;

    public ListThreadB(MyList list){
        this.list = list;
    }

    @Override
    public void run() {
        for(int i=0;i<100000;i++){
            list.add("threadB"+(i=1));
        }
    }
}
