package com.optum.LinkList.SingleLinkList.DoubleLinkList;

public class Driver {

    public static void main(String[] args)
    {
        DoubleLinkList d = new DoubleLinkList();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        d.add(60);
        d.add(70);
        d.reverse();
        d.traverse();
    }



}
