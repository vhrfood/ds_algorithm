package vhr.list;

import org.w3c.dom.NodeList;

public class MergeLinkList {

    public static void main(String[] args) {
        MyList<Integer> first = new MyList<>();
        first.addLast(1);
        first.addLast(8);
        first.addLast(9);
        first.addLast(10);
        /*MyList<Integer> scnd = new MyList<>();
        scnd.addLast(5);
        scnd.addLast(6);
        scnd.addLast(13);
        scnd.addLast(14);*/
        System.out.println("**** First List*****");
        first.printList();
       /* System.out.println("\n**** Second List*****");
        scnd.printList();*/
    }


   
}
