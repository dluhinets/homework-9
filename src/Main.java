import generic.*;

public class Main {
    public static void main(String[] args) {
        //testMyArrayList();
        //testMyLinkedList();
        //testMyQueue();
        //testMyStack();
        testMyHashMap();
    }

    public static void testMyArrayList() {
        System.out.println("!!!---myArrayList--!!!");
        MyArrayList<String> myArrayList = new MyArrayList();
        System.out.println("Add to myArrayList 10 elem");
        for (int i = 1; i <= 10; i++) {
            myArrayList.add(String.valueOf(i));
        }
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(4) = " + myArrayList.get(4));
        System.out.println("Remove elem, index 4");
        myArrayList.remove(4);
        System.out.println("myArrayList.get(4) = " + myArrayList.get(4));
        System.out.println("Clear myArrayList");
        myArrayList.clear();
        System.out.println("myArrayList.size() = " + myArrayList.size());
    }

    public static void testMyLinkedList() {
        System.out.println("!!!---MyLinkedList---!!!");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.printAll();
        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.add(13);
        myLinkedList.printAll();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
        myLinkedList.add(-13);
        myLinkedList.printAll();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.add(1300);
        myLinkedList.printAll();
        myLinkedList.add(1);
        myLinkedList.add(1566);
        myLinkedList.printAll();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(1) = " + myLinkedList.get(1));
        System.out.println("Remove elem, index 1");
        myLinkedList.remove(1);
        myLinkedList.printAll();
        System.out.println("myLinkedList.get(1) = " + myLinkedList.get(1));
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("Clear MyLinkedList");
        myLinkedList.clear();
        myLinkedList.printAll();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
    }

    public static void testMyQueue() {
        System.out.println("!!!---MyQueue---!!!");
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.printAll();
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.peek() = " + myQueue.peek());
        myQueue.add("Test 1");
        myQueue.printAll();
        System.out.println("myQueue.peek() = " + myQueue.peek());
        myQueue.add("Test 2");
        myQueue.printAll();
        System.out.println("myQueue.peek() = " + myQueue.peek());
        myQueue.add("Test 3");
        myQueue.printAll();
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        myQueue.printAll();
        System.out.println("myQueue.poll() = " + myQueue.poll());
        myQueue.printAll();
        System.out.println("myQueue.poll() = " + myQueue.poll());
        myQueue.printAll();
        System.out.println("myQueue.poll() = " + myQueue.poll());
        myQueue.printAll();
        myQueue.add("Test 3");
        myQueue.printAll();
        System.out.println("myQueue.poll() = " + myQueue.poll());
        myQueue.printAll();
        myQueue.add("Test 1");
        myQueue.add("Test 2");
        myQueue.add("Test 3");
        myQueue.printAll();
        System.out.println("Clear MyQueue");
        myQueue.clear();
        myQueue.printAll();
    }

    public static void testMyStack() {
        System.out.println("!!!---MyStack---!!!");
        MyStack<String> myStack = new MyStack<>();
        myStack.printAll();
        System.out.println("myQueue.size() = " + myStack.size());
        System.out.println("myQueue.peek() = " + myStack.peek());
        myStack.add("Test 1");
        myStack.printAll();
        System.out.println("myQueue.peek() = " + myStack.peek());
        myStack.add("Test 2");
        myStack.printAll();
        System.out.println("myQueue.peek() = " + myStack.peek());
        myStack.add("Test 3");
        myStack.printAll();
        myStack.add("Test 4");
        myStack.printAll();
        System.out.println("Remove elem, index 2");
        myStack.remove(2);
        myStack.printAll();
        System.out.println("myQueue.size() = " + myStack.size());
        System.out.println("myQueue.peek() = " + myStack.peek());
        System.out.println("myQueue.peek() = " + myStack.peek());
        System.out.println("myQueue.poll() = " + myStack.poll());
        myStack.printAll();
        System.out.println("myQueue.poll() = " + myStack.poll());
        myStack.printAll();
        System.out.println("myQueue.poll() = " + myStack.poll());
        myStack.printAll();
        System.out.println("myQueue.poll() = " + myStack.poll());
        myStack.printAll();
        myStack.add("Test 3");
        myStack.printAll();
        System.out.println("myQueue.poll() = " + myStack.poll());
        myStack.printAll();
        myStack.add("Test 1");
        myStack.add("Test 2");
        myStack.add("Test 3");
        myStack.printAll();
        System.out.println("Clear MyQueue");
        myStack.clear();
        myStack.printAll();
    }

    public static void testMyHashMap() {
        System.out.println("!!!---MyHashMap---!!!");
        MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();
        myHashMap.printAll();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.put("Яблуко", 10);
        myHashMap.printAll();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.put("Груша", 20);
        myHashMap.put("Айва", 3);
        myHashMap.printAll();
        myHashMap.remove("Яблуко");
        myHashMap.printAll();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.put("Яблуко", 10);
        myHashMap.put("Айва", 3);
        myHashMap.printAll();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.remove("Айва");
        myHashMap.remove("Груша");
        myHashMap.remove("Яблуко");
        myHashMap.printAll();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.put("Яблуко", 10);
        myHashMap.put("Яблуко", 10);
        myHashMap.printAll();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.put("Айва", 3);
        myHashMap.printAll();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.remove("Яблуко");
        myHashMap.printAll();
        myHashMap.clear();
        myHashMap.printAll();
        myHashMap.put("Яблуко", 10);
        myHashMap.put("Яблуко", 11);
        myHashMap.put("Айва", 3);
        myHashMap.printAll();
        System.out.println("myHashMap.get(Яблуко) = " + myHashMap.get("Яблуко"));
        System.out.println("myHashMap.get(Айва) = " + myHashMap.get("Айва"));
    }

}