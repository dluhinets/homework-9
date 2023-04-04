package generic;

public class MyHashMap<K, V> {
    private Node first = new Node();


    public void put(Object key, Object value) {
        Node node = new Node();
        node.key = key;
        node.value = value;
        if (first.next == null) {
            first.next = node;
            return;
        }
        Node currentElement = first.next;
        while (currentElement.next != null) {
            if (currentElement.key.equals(key)) {
                return;
            }
            currentElement = currentElement.next;
        }
        if (currentElement.key.equals(key)) {
            return;
        }
        currentElement.next = node;
    }

    public void remove(Object key) {
        Node currentElement = first.next;
        if(currentElement == null) {
            return;
        }
        if (currentElement.key.equals(key) && currentElement.next == null) {
            first = new Node();
            return;
        } else if (currentElement.key.equals(key)) {
            Node nextElement = currentElement.next;
            first.next = nextElement;
            return;
        }
        Node prevElement = currentElement;
        while (currentElement != null) {
            if (currentElement.key.equals(key)) {
                Node nextElement = currentElement.next;
                prevElement.next = nextElement;
                return;
            }
            prevElement = currentElement;
            currentElement = currentElement.next;
        }
    }

    public Object get(Object key) {
        Node currentElement = first.next;
        while (currentElement != null) {
            if (currentElement.key.equals(key)){
                return currentElement.value;
            }
            currentElement = currentElement.next;
        }
        return null;
    }


    public void clear() {
        first = new Node();
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
            System.out.print("MyHashMap is empty");
        }
        while (currentElement != null) {
            System.out.print("[" +currentElement.key + ", " + currentElement.value + "] ");
            currentElement = currentElement.next;
        }
        System.out.println("");
    }
    public static class Node {
        private Node next;
        private Object key;
        private Object value;
    }
}
