package com.optum.LinkList.SingleLinkList.HashMap;

public class HashMapDriver {
    public static void  main(String[] args)
    {
        ImplementHashMap m = new ImplementHashMap();
        m.put(10,"malya");
        m.put(11,"malya1");
        m.put(20,"Rashi");
        m.put(32,"malya3");
        m.put(10,"mon");
        System.out.println("----------------");

        System.out.println(m.Get(20));

        System.out.println("----------------");

        m.Iterator();
    }
}
