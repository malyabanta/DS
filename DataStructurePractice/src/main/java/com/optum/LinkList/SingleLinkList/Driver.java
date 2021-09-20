package com.optum.LinkList.SingleLinkList;

public class Driver {

    public static void main(String[] args)
    {
        ImplimentSingleLinkList s = new ImplimentSingleLinkList();
        s.add(10);
        s.add(25);
        s.addLast(55);
        s.addLast(41);
        s.addLast(11);
        s.addLast(60);
        s.addLast(40);
        s.addElementMiddle(101);
        //s.delete(20);
        //s.traverse();
        //s.reverseList();
       // s.bubblesort();
        //s.traverse();
        //s.dropDuplicates();
        s.traverse();
        //s.lengh();
        s.swapNode(25,11);
        s.traverse();

    }


}
