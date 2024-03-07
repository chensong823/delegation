package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{


    public void testPush(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(Integer.valueOf(3), myStack.pop());
    }

    public void testPop(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(Integer.valueOf(3), myStack.pop());
    }
}
