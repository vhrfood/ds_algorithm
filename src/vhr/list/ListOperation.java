package vhr.list;

public class ListOperation {
    
 

    public ListNode<Integer> addList(ListNode<Integer> first, ListNode<Integer> scnd) {

        // fst-1 2 3 4
        // scnd 1 2
        

    }

  
    
    public ListNode<Integer> addList(ListNode<Integer> first, ListNode<Integer> second, int carry){
        ListNode<Integer> result=null;
        int addition=first.data+second.data+carry;
        ListNode<Integer> newNode = new ListNode<>(addition, null);
        newNode.next=result;
        result=newNode;
        return addDigit/10;
       
        
    }

    public int 
}
