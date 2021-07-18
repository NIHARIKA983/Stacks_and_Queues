package com.datastructure;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }
    //method to return head(first) node in list
    public INode getHead() {
        return this.myLinkedList.head;
    }
    //method to return tail(last) node in list
    public INode getTail() {
        return this.myLinkedList.tail;
    }
    //method to add node at the end of linked list(enqueue)
    public void enQueue(INode newNode) {
        myLinkedList.append(newNode);
    }
    //method to print nodes in list
    public void printQueue() {
        myLinkedList.printMyNodes();
    }
}
