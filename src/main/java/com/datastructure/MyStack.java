package com.datastructure;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }
    public static void main(String[] args) {
        System.out.println("Data Structures - Stack And Queue - Problem Using LinkedList");
    }
}
