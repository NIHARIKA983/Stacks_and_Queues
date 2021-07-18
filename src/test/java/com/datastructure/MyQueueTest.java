package com.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    //UC3
    @Test
    public void given3Numbers_WhenAddedToQueue_ShouldAddAtEnd(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        myQueue.printQueue();
        boolean result = myQueue.getHead().equals(myFirstNode) &&
                myQueue.getHead().getNext().equals(mySecondNode) &&
                myQueue.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }
    //UC4
    @Test
    public void given3Numbers_WhenDeletedANode_ShouldMatchWith_NodeAtBeginning(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        INode frontNode = myQueue.deQueue();
        myQueue.printQueue();
        Assert.assertEquals(myFirstNode,frontNode);
    }
}
