package vhr.queue;

import vhr.list.ListNode;
import vhr.list.MyList;

public class MyQueue<T> {

    public MyList<T> queue;

    public MyQueue() {
        super();
        this.queue = null;
    }

    public boolean push(T data) {
        return queue.addLast(data);

    }

    public ListNode<T> pop() {

        return queue.removeFirst();

    }
    
    public boolean isNotEmpty(){
        if(this.queue==null){
            return false;
        }
        return true;
    }

}
