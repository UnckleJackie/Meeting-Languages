package StructuresAndAlgoritmes_Lafore.Head_05.Listing_08;

import java.io.IOException;

public class InterIterApp2 {
    public static void main(String[] args) throws IOException {
        LinkList theList = new LinkList();
        ListIterator iter1 = theList.getIterator();

        iter1.insertAfter(21);
        iter1.insertAfter(40);
        iter1.insertAfter(30);
        iter1.insertAfter(7);
        iter1.insertAfter(45);

        theList.displayList();

        iter1.reset();
        Link aLink = iter1.getCurrent();
        if (aLink.dData % 3 == 0)
            iter1.deleteCurrent();
        while (!iter1.atEnd()) {
            iter1.nextLink();
            aLink = iter1.getCurrent();
            if (aLink.dData % 3 == 0)
                iter1.deleteCurrent();
        }
        theList.displayList();
    }
}
