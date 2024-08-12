package StructuresAndAlgoritmes_Lafore.Head_05.Listing_08;

public class Link {
    public long dData;
    public Link next;

    public Link(long dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
