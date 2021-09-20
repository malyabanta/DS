package com.optum.LinkList.SingleLinkList.DoubleLinkList;

public class Node<T> {
    Node<T> Previous = null;
    Node<T> next = null;
    T data = null;


    public Node<T> getPrevious() {
        return Previous;
    }

    public void setPrevious(Node<T> previous) {
        Previous = previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
