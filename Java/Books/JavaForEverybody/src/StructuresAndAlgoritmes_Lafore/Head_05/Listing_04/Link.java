package StructuresAndAlgoritmes_Lafore.Head_05.Listing_04;

public class Link {
    public long dData;
    public Link next;

    public Link(long d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}