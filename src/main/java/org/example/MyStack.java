package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<E> {

    private ArrayList<E> delegate;
    public MyStack(){
        delegate = new ArrayList<>();
    }


    public void push(E e) {
        delegate.add(e);
    }
//    public void push(E e) {
//        add(e);
//    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        return delegate.remove(delegate.size() - 1);
    }

    private boolean isEmpty() {
        return delegate.isEmpty();
    }


//    public E pop() {
//        if (isEmpty()) throw new EmptyStackException();
//        E e = get(size() - 1);
//        remove(size() -1 );
//        return e;
//    }

}
