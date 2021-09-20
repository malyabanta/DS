package com.optum.LinkList.SingleLinkList;

import java.lang.annotation.ElementType;

public class ImplimentSingleLinkList<T> {

    Node<T> head;
    Node<T> tail;

    public void add(T element)
    {
         Node<T> nd = new Node<T>();
         nd.setData(element);
         nd.setNextNode(null);

        if(head == null)
        {
            head = nd;
            tail = nd;
        }else{
            nd.setNextNode(head);
            head = nd;

        }
    }

    public void addLast(T Element)
    {
        Node<T> nd= new Node();
        nd.setData(Element);
        nd.setNextNode(null);

        if(head == null)
        {
            head = nd;
            tail = nd;
        }else{

            tail.setNextNode(nd);
            tail = nd;
        }
    }

    public void addElementMiddle(T element)
    {
        Node nd = new Node();
        nd.setNextNode(null);
        nd.setData(element);

        Node current = head;
        Node Previous = null;

        Node temp = current;
        int count = 0;
        while(temp != null)
        {
            temp = temp.getNextNode();
            count++;
        }
        int i =1;
        System.out.println("count"+ count);

        while(i<= count/2)
        {
            Previous = current;
            current = current.getNextNode();
            i++;
        }
        nd.setNextNode(current);
        Previous.setNextNode(nd);

    }

    public void delete(T element)
    {
        Node current = head;
        Node prev = current;

        if(head == null)
        {
            System.out.println("Empty list");
        }else if(head.getData()==element)
        {
            head = head.getNextNode();
        }else
         {
            while (current != null) {
                if (current.getData() == element && current==tail)
                {
                    prev.setNextNode(null);
                    tail = prev;
                    break;
                }
                if(current.getData() == element)
                {
                    prev.setNextNode(current.getNextNode());
                    current.setNextNode(null);
                    break;
                }
                prev = current;
                current = current.getNextNode();
            }
        }
    }


    /*
    Reverse a list
     */

    public void reverseList()
    {
        Node current = head;
        Node Prev = head;
        Node Next = current.getNextNode();
        Node Temp = null;

        while(Next !=null)
        {
            current.setNextNode(Temp);
            Temp = current;
            current = Next;
            Next =Next.getNextNode();
        }
        current.setNextNode(Temp);
        head=current;
        tail = Prev;

    }



    /*
    sort a lit
     */

    public void bubblesort()
    {

        boolean isChanged = true;

        while(isChanged)
        {
           Node prev = null;
            Node current = head;
            Node next = current.getNextNode();

            isChanged = false;

            if(current != null)
            {
                while(current!=null && next!=null)
                {
                    if(Integer.parseInt(current.getData().toString() ) > Integer.parseInt(next.getData().toString()))
                    {
                        if(current == head)
                        {
                            head = next;
                        }else{
                            prev.setNextNode(next);
                        }
                        current.setNextNode(next.getNextNode());
                        next.setNextNode(current);
                        current=next;
                        //prev = current;
                        //next = prev.getNextNode();
                        isChanged = true;

                    }
                    prev = current;
                    current=next;
                    next = current.getNextNode();
                }
            }else{
                System.out.println("no elements available in list");
            }
        }


    }


    /*
    Remove Duplicates from a list
     */

  public void dropDuplicates()
  {
      bubblesort();

      Node current = head;
      Node Next = current.getNextNode();
      while(Next!=null)
      {
          if(Integer.parseInt(current.getData().toString()) == Integer.parseInt(Next.getData().toString()))
          {
              if(current == head)
              {
                  head = Next;
              }else{
                  current.setNextNode(Next.getNextNode());
                  Next = current.getNextNode();
              }

          }
          current= Next;
          Next = current.getNextNode();
      }


  }


  // length of a linklist in recursive
    public void lengh()
    {
        if( head !=null && head != tail)
        {
            Node current = head;
            Node next = current.getNextNode();
            System.out.println("head"+head.getData());
            head = next;
            lengh();
        }

    }

    /*
     swap node in a given key
     */

    public void swapNode(T k1 , T k2)
    {
        Node temp = null ;
        Node temp1 = null;
        Node current = head;
        Node prev = head;
        Node prev1 = head;
        Node Next = current.getNextNode();

        while(current !=null)
        {
            if(head.getData()==k1)
            {
                prev = head;
                temp = head;
            }

            if(Next.getData() == k1)
            {
                prev = current;
                temp = Next;
            }else if(Next.getData() == k2)
            {
                prev1=current;
                temp1=Next;
            }
            if(temp != null && temp1 !=null)
            {
                break;
            }
            current = Next;
            Next = Next.getNextNode();
        }

        if(temp == head) {
            Node dummy = temp1.getNextNode();
            temp1.setNextNode(temp.getNextNode());
            head = temp1;

            prev1.setNextNode(temp);
            temp.setNextNode(dummy);


        }else {
            prev.setNextNode(temp1);
            Node dummy = temp1.getNextNode();
            temp1.setNextNode(temp.getNextNode());

            prev1.setNextNode(temp);
            temp.setNextNode(dummy.getNextNode());
        }



    }


    /*
    Traverse a link list
     */

    public void traverse()
    {
        Node temp = head;
        System.out.println("-----------------------------");
        while(temp != null)
        {
            System.out.println(temp.getData());
            temp = temp.getNextNode();
        }
        System.out.println("-----------------------------");
    }
}
