package com.optum.LinkList.SingleLinkList.Queue;

public class ImplementQueue {
    int front = 0;
    int rear = 0;
    int capacity = 10;
    int[] arr = new int[capacity];

    public void enQueue(int element)
    {
        if(rear < capacity)
        {
            rear++;
            arr[rear] = element;
        }else{
            System.out.println("Over loaded Quue");
        }
    }

    public void dequeue()
    {
        if(rear == -1)
        {
            front --;
            System.out.println("empty Queue");
        }else{
            System.out.println(arr[front]);
            front--;
        }



    }
}
