package LinkListImplement;

public class Node<T> {
    private int data;
    private Node<T> NextNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return NextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        NextNode = nextNode;
    }
}
