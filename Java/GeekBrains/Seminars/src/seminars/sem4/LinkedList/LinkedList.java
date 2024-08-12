package seminars.sem4.LinkedList;

public class LinkedList {
    private class Node {
        int date;
        Node next;

        public Node(int date, Node next) {
            this.date = date;
            this.next = next;
        }

        public Node() { }
    }
    private Node head;
    public LinkedList() {
        head = new Node();
    }
    public void addFirst(int value) {
        Node newNode = new Node(value, head.next);
        head.next = newNode;
    }
    public void addLast(int value) {
        Node currentNode = head;
        for (; currentNode.next != null; currentNode = currentNode.next) {

        }
        currentNode.next = new Node(value, null);
    }
    public void deleteFirst() {
        head.next = (head.next == null) ? null : head.next.next;
    }
    public void deleteList() {
        if (head.next == null) {
            return;
        }
        Node currentNode = head.next;
        Node previousNode = head;
        for (; currentNode.next != null; currentNode = currentNode.next) {
            previousNode = currentNode;
        }
        previousNode.next = null;
    }
    public void insertByIndex(int value, long index) {
        long nodeNumber = 0;
        for (Node currentNode = head; currentNode != null; currentNode = currentNode.next) {
            if (nodeNumber == index) {
                currentNode.next = new Node(value, currentNode.next);
                return;
            }
            nodeNumber += 1L;
        }
        throw new IndexOutOfBoundsException();
    }
    public void deleteByIndex(long index) {
        long nodeNumber = 0;
        Node currentNode = head.next;
        Node previousNode = head;
        for (; currentNode != null; currentNode = currentNode.next) {
            if (nodeNumber == index) {
                previousNode.next = currentNode.next;
                currentNode.next = null;
                return;
            }
            previousNode = currentNode;
            nodeNumber += 1;
        }
        throw new IndexOutOfBoundsException();
    }
    public int getByIndex(long index) {
        long nodeNumber = 0;
        Node currentNode = head.next;
        for (; currentNode != null; currentNode = currentNode.next) {
            if (nodeNumber == index) {
                return currentNode.date;
            }
            nodeNumber += 1L;
        }
        throw new IndexOutOfBoundsException();
    }
    public void setByIndex(int value, long index) {
        long nodeNumber = 0;
        Node currentNode = head.next;
        for (; currentNode != null; currentNode = currentNode.next) {
            if (nodeNumber == index) {
                currentNode.date = value;
                return;
            }
            nodeNumber += 1L;
        }
        throw new IndexOutOfBoundsException();
    }
    public long getLength() {
        long size = 0;
        for (Node currentNode = head.next; currentNode != null; currentNode = currentNode.next) {
            size += 1L;
        }
        return size;
    }
    @Override
    public String toString() {
        String result = "";
        for (Node currentNode = head.next; currentNode != null; currentNode = currentNode.next) {
            result += currentNode.date + " -> ";
        }
        return result;
    }
}
