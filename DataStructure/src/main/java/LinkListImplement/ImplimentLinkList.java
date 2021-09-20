package LinkListImplement;

import jdk.nashorn.internal.runtime.regexp.joni.constants.Traverse;

import java.util.LinkedList;

public class ImplimentLinkList<T> {

    Node<T> head ;
    Node<T> Tail;

    public void add( int Element )
    {
        Node<T> nd = new Node();
        nd.setData(Element);


        if(head == null)
        {
            head = nd;
            Tail = nd;
        }else{
            Tail.setNextNode(nd);
            Tail = nd;
        }


    }

    public void addFirst(int Element)
    {
        Node<T> nd = new Node<T>();
        nd.setData(Element);
        if(head == null)
        {
            head = nd;
            Tail = nd;
        }else{
            nd.setNextNode(head);
            head = nd;
        }



    }

    public void addAfterElement(int Element , int AfterElement)
    {
        Node<T> nd = new Node<T>();
        nd.setData(Element);

        if(head == null)
        {
            System.out.println("empty list");
        }

        Node<T> tmp = head;
        while(true)
        {
            if(tmp.getData() == AfterElement )
            {
                Node<T> newNode = tmp.getNextNode();
                nd.setNextNode(newNode);
                tmp.setNextNode(nd);

                break;

            }

            tmp = tmp.getNextNode();


        }



    }

    // Delete Node from list
    public void delete(int Element)
    {
       Node tmp = head;
       Node Previous = null;

       while(true)
       {
          if(head == null)
          {
              System.out.println("Empty string");
              break;
          }

          if (tmp.getData()== Element)
           {
               if(tmp==head)
               {
                   head = head.getNextNode();
               }
               else{
                   Previous.setNextNode(tmp.getNextNode());
                   tmp.setNextNode(null);

               }



               break;

           }
           Previous = tmp;
           tmp  = tmp.getNextNode();
       }
    }


    // Add an element in middle of he list

    public void addElementInMiddle(int Element)
    {
        Node current = head ;
        Node next = current;
        Node prev = null;

        while(next != null &&  next != Tail)
        {
            prev = current;
            current = next;
            next = next.getNextNode().getNextNode();
        }

        Node nd = new Node();
        nd.setData(Element);

        nd.setNextNode(current);
        prev.setNextNode(nd);

    }

// Remove duplicate element from an list

    public void removeDuplicate()
    {
         bubblesort();
         Node prev = null;
         Node current = head;
         Node next = current.getNextNode();

         while(next != null)
         {
             if(current.getData() == next.getData())
             {
                 current.setNextNode(null);
                 current = next;
                 prev.setNextNode(current);
                 next = next.getNextNode();
             }else{
                 prev = current;
                 current= next;
                 next = next.getNextNode();
             }

         }

    }



    public void ReverseLinkList()
    {
        Node prev = null;
        Node current = head;
        Node next = null;


        while(current != null)
        {
            next = current.getNextNode();
            current.setNextNode(prev);
            prev = current;
            current = next;

        }
        head = prev;


    }

    // Implement bubble sort

    public void bubblesort()
    {
        boolean isChanged = true;
        int i = 0 ;
        while(isChanged)
        {

            Node prev = null;
            Node current = head;
            Node next = current.getNextNode();
            isChanged= false;

            if(current != null)
            {
              while(current != null && next !=null)
              {
                  if(current.getData() >  next.getData()) {
                      if (current == head) {
                          head = next;

                      } else {
                         prev.setNextNode(next);

                      }
                      current.setNextNode(next.getNextNode());
                      next.setNextNode(current);
                      isChanged= true;
                      current = next;
                  }
                  prev = current;
                  current = prev.getNextNode();
                  next = current.getNextNode();

              }

              i++;
             // System.out.println("no of Iteration : "+ i);

            }else{
                System.out.println("Empty list");
            }
        }
    }






    public void Traverse()
    {
        Node<T> tmp = head;
        while(true) {

            if (tmp == null) {

                break;
            }

            System.out.println(tmp.getData());
            tmp= tmp.getNextNode();
        }



    }

}
