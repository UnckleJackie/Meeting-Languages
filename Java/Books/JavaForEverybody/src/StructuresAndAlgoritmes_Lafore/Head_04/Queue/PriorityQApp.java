package StructuresAndAlgoritmes_Lafore.Head_04.Queue;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class PriorityQApp {
    public static void main(String[] args) throws IOException {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.print(item + " ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
