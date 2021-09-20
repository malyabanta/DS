package DoubleLinkListImplemantation;

public class node<T> {

    private  node<T> previous ;
    private  node<T> next;
    private int data ;

    public node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(node<T> previous) {
        this.previous = previous;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
