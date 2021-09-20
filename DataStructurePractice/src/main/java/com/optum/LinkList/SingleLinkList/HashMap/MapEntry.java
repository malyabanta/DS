package com.optum.LinkList.SingleLinkList.HashMap;

public class MapEntry<T,T1>{

    T1 Value;
    T Key;
    MapEntry Next;


    public MapEntry(T key, T1 Value)
    {
        this.Key = key ;
        this.Value = Value;
        this.Next = null;
    }

    public T1 getValue() {
        return Value;
    }

    public void setValue(T1 value) {
        Value = value;
    }

    public T getKey() {
        return Key;
    }

    public void setKey(T key) {
        Key = key;
    }

    public MapEntry getNext() {
        return Next;
    }

    public void setNext(MapEntry next) {
        Next = next;
    }




}
