package com;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue<T> {
    private Queue<T> queue;

    public CustomQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.offer(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.poll();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        CustomQueue<Object> queue = new CustomQueue<>();

        
        queue.enqueue("Hello");
        queue.enqueue(42);
        queue.enqueue("World");

        
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
