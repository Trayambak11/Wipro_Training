package com.assign;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStack<T> {
    private List<T> stack;

    public CustomStack() {
        this.stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
