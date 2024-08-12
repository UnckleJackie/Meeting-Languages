package StructuresAndAlgoritmes_Lafore.Head_05.Listing_04;

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(long key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while (current != null && key > current.dData) {
            previous = current;
            current = current.next;
        }
        if (previous == null)
            first = newLink;
        else
            previous.next = newLink;
        newLink.next = current;
    }

    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public long deleteFirst() {
        long temp = first.dData;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
