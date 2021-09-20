package DoubleLinkListImplemantation;

public class DoubleLinkListImplementation {

    node head = null;
    node tail = null;

    public void add(int Element)
    {
        node nd = new node();
        nd.setData(Element);
        nd.setNext(null);
        nd.setPrevious(null);

        if (head == null)
        {
           head = nd;
           tail = nd;
        }else{

            nd.setPrevious(tail);
            tail.setNext(nd);
            tail = nd;

        }

    }

    public void addFirst(int Element)
    {
        node nd = new node();
        nd.setNext(null);
        nd.setData(Element);
        nd.setPrevious(null);

        if(head == null) head = nd;
        else {
            nd.setNext(head);
            head.setPrevious(nd);
            head = nd;

        }


    }

    public void addAfterElement(int Element , int NewElement)
    {
        node temp = head ;
        node nd = new node();
        nd.setData(NewElement);
        nd.setPrevious(null);
        nd.setNext(null);
        while(temp.getData() != Element)
        {
            temp = temp.getNext();
        }
        node NextNode = temp.getNext();
        nd.setNext(NextNode);
        nd.setPrevious(temp);
        NextNode.setPrevious(nd);
        temp.setNext(nd);

    }


    // Delete element from the list

    public void deleteElement( int Element )
    {
        node temp = head;
        while(true) {
            if (temp.getData() == Element)
            {
                if(temp == head)
                {
                    head = temp.getNext();
                    head.setPrevious(null);
                    break;
                }
                else if(temp == tail)
                {
                    tail = temp.getPrevious();
                    tail.setNext(null);
                    break;
                }
                else
                {
                    node nd1 = temp.getPrevious();
                    node nd2 = temp.getNext();

                    nd1.setNext(nd2);
                    nd2.setPrevious(nd1);
                    break;


                }

            }
            temp = temp.getNext();
        }

    }
//1
//10
//20
//30
//40
//50
//60
    // reverse a linklist


    public void reverseAList()
    {
        node temp = head ;

        while(true) {


            if (temp == head) {
                node nextnode = temp.getNext();
                temp.setPrevious(nextnode);
                temp.setNext(null);
                //nextnode.setPrevious(nextnode.getNext());
                //nextnode.setNext(temp);
            } else {
                node nextnode = temp.getNext();
                node prev = temp.getPrevious();
                temp.setNext(prev);
                temp.setPrevious(nextnode);
                if(temp == tail) break;


            }
           temp = temp.getPrevious();
        }
        tail = head;
        head = temp;


    }





    public void traverse()
    {
        node temp = head;
        while(temp != null)
        {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }


}
