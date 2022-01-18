package com.codegym;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<E> {
    private LinkedList <E> stack = new LinkedList<>();

    public MyGenericStack() {
    }

    public void push(E elment) {
        stack.addFirst(elment);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public E pop (){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
}
