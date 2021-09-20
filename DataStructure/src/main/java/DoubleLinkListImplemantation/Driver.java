package DoubleLinkListImplemantation;

public class Driver {

    public static void main(String args[]) {
        DoubleLinkListImplementation dList = new DoubleLinkListImplementation();
        dList.add(10);
        dList.add(20);
        dList.add(30);
        dList.add(50);
        dList.add(60);
        dList.add(70);
        dList.addAfterElement(30,40);
        dList.addFirst(01);
        dList.deleteElement(70);
        dList.reverseAList();
        dList.traverse();

    }



}
