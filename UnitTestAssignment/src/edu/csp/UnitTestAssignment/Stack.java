package edu.csp.UnitTestAssignment;

import java.util.ArrayList;

public class Stack<E> {
    ArrayList<E> array;
    
    public Stack() {
        this.array = new ArrayList<>(20);
    }
    
    public Stack(int capacity) {
        this.array = new ArrayList<>(capacity);
    }
    
    public E pop() {
        E top = array.get(0);
        if (this.empty()) {
            throw new EmptyStackException("Stack is empty.");
        } else {
            array.remove(top);
        }
        return top;
    }
    
    // This method uses a counter when checking whether the fixed ArrayList is
    // filled in.  If the ArrayList is full, a FullStackException is thrown.
    // If the ArrayList is not full, the item is added to the top of the list.
    public E push(E item) {
        int counter = 0;
        for (int i = 0; i < array.size(); i++) {
            if(array.contains(array.get(i))) {
                counter++;
            } 
        }
        if (array.size() == (counter - 1)) {
            throw new FullStackException("Full stack.");
        } else {
            array.add(0, item);           
        }        
        return item;
    }
    
    public E peek() {
        if (this.empty()) {
            throw new EmptyStackException("Stack is empty.");
        } else {
            return array.get(0);
        }
    }
    
    public boolean empty() {
        return array.isEmpty();
    }
}

class FullStackException extends RuntimeException {
    public FullStackException(String msg) {
        super(msg);
    }
}

class EmptyStackException extends RuntimeException {
    public EmptyStackException(String msg) {
        super(msg);
    }
}
