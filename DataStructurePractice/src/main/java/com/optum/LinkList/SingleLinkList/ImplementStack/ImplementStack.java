package com.optum.LinkList.SingleLinkList.ImplementStack;

import java.util.EmptyStackException;
import java.util.Stack;

public class ImplementStack<T> {

    int top = -1;
    int size = 1000;
    Object[] arr = new Object[size];

    public void push(T element)
    {
        if(top == size)
        {
            throw new StackOverflowError();

        }else{
            top++;
            arr[top] = element;
        }


    }
    public T pop()
    {
        if(top == -1)
        {
            throw new EmptyStackException();

        }else{

            T value = (T)arr[top];
            top --;
            return value;
        }


    }

    public void traverse()
    {
        int temp = top;
        if(temp == -1)
        {
            System.out.println("empty stack");
        }
        while(temp != -1)
        {
            System.out.println(arr[temp]);
            temp--;
        }

    }

}
