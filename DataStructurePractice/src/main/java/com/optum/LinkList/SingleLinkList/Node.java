package com.optum.LinkList.SingleLinkList;

public class Node<T> {
    T Data;
    Node<T> nextNode;

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
