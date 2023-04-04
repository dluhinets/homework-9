package generic;

public class MyStack<T> {
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
        Node currentElement = first.next;
        if(currentElement == null) {
            return null;
        }
        return (T) currentElement.value;
    }

    public T poll() {
        Node currentElement = first.next;
        if(currentElement == null) {
            return null;
        }
        Object result = currentElement.value;
        Node nextElement = currentElement.next;
        if (nextElement == null) {
            first = new Node();
            last = new Node();
            return (T) result;
        }
        nextElement.prev = null;
        first.next = nextElement;
        return (T) result;
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
            System.out.print("MyStack is empty");
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
