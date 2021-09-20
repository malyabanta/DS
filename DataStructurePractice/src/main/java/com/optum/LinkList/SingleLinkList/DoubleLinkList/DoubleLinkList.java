package com.optum.LinkList.SingleLinkList.DoubleLinkList;

public class DoubleLinkList<T> {

    Node<T> head = null;
    Node<T> tail = null;

    public void add(T element )
    {
        Node<T> nd = new Node();
        nd.setNext(null);
        nd.setPrevious(null);
        nd.setData(element);

        if(head == null)
        {
            head = nd;
            tail = nd;
        }else{
            nd.setPrevious(tail);
            tail.setNext(nd);
            tail = nd;
        }

    }

    public void reverse()
    {
        Node current = head;
        Node previous = null;
        Node Next = current.getNext();

        while(Next != null)
        {
            if(current == head)
            {
                current.setNext(null);
                current.setPrevious(Next);
                tail = current;
            }else
            {
                current.setNext(previous);
                current.setPrevious(Next);
            }
            previous = current;
            current= Next;
            Next= Next.getNext();
        }
        current.setNext(previous);
        head = current;


    }

    public void traverse()
    {
        Node current = head;
        while(current!=null)
        {
            Integer data = (Integer)current.getData();
            System.out.println(data);
            current = current.getNext();

        }
    }
}
