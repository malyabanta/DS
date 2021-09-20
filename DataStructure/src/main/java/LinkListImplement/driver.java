package LinkListImplement;

public class driver {
    public static void main(String[] args)
    {
        ImplimentLinkList list1 = new ImplimentLinkList();
        list1.add(30);
        list1.add(10);
        list1.add(20);
        list1.add(101);
        list1.add(201);
        list1.add(30);
        list1.add(40);
        list1.addFirst(5);
        list1.addAfterElement(25,20);
        list1.add(50);
        list1.add(10);
       // list1.add(70);
        list1.delete(40);

      System.out.println("calling bubble sort");
       list1.bubblesort();
        list1.removeDuplicate();

        //5,30,10,20,25,50
      //  list1.ReverseLinkList();
        list1.Traverse();
        list1.addElementInMiddle(100);
        list1.Traverse();
    }
}
