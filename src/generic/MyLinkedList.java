package generic;

import java.util.Arrays;

public class MyLinkedList<T> {
    private Node first = new Node();
    private Node last = new Node();

    public void add(Object item) {
        Node node = new Node();
        if (first.next == null) {
            node.value = item;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }
        node.value = item;
        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public void remove(int index) {
        if (first.next == null) {
            return;
        }
        Node currentElement = first.next;
        if (index == 0) {
            currentElement.prev = null;
            first = currentElement;
            return;
        }
        int countList = 0;
        while (currentElement != null) {
            if (countList == index){
                Node previous = currentElement.prev;
                previous.next = currentElement.next;
                return;
            }
            currentElement = currentElement.next;
            countList++;
        }
    }

    public T get(int index) {
        Node currentElement = first.next;
        int countList = 0;
        while (currentElement != null) {
            if (countList == index){
                return (T) currentElement.value;
            }
            currentElement = currentElement.next;
            countList++;
        }
        return null;
    }

    public void clear() {
        first = new Node();
        last = new Node();
    }

    public int size() {
        int listSize = 0;
        Node currentElement = first.next;
        while (currentElement != null) {
            listSize++;
            currentElement = currentElement.next;
        }
        return listSize;
    }

    public void printAll() {
        Node currentElement = first.next;
        if(currentElement == null) {
            System.out.print("MyLinkedList is empty");
        }
        while (currentElement != null) {
            System.out.print(currentElement.value + " ");
            currentElement = currentElement.next;
        }
        System.out.println();
    }
    public static class Node {
        private Node prev;
        private Object value;
        private Node next;
    }
}
