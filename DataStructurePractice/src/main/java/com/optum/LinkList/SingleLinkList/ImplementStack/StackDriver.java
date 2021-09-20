package com.optum.LinkList.SingleLinkList.ImplementStack;

public class StackDriver {
    public static void main(String[] args)
    {
        ImplementStack t = new ImplementStack();
        t.push(10);
        t.push(20);
        t.push(30);
        t.traverse();
        System.out.println("--------");
        System.out.println(t.pop());

        System.out.println("--------");
        System.out.println(t.pop());
        System.out.println("--------");
        t.traverse();

    }
}
