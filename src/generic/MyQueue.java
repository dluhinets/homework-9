package generic;

public class MyQueue<T> {
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

    public T peek() {
        Node currentElement = last.prev;
        if(currentElement == null) {
            return null;
        }
        return (T) currentElement.value;
    }

    public T poll() {
        Node currentElement = last.prev;
        if(currentElement == null) {
            return null;
        }
        Object result = currentElement.value;
        Node prewElement = currentElement.prev;
        if (prewElement == null) {
            first = new Node();
            last = new Node();
            return (T) result;
        }
        prewElement.next = null;
        last.prev = prewElement;
        return (T) result;
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
            System.out.print("MyQueue is empty");
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
