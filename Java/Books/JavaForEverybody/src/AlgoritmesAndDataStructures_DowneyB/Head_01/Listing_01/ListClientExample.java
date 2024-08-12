package AlgoritmesAndDataStructures_DowneyB.Head_01.Listing_01;

import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    private List list;

    public ListClientExample() {
        list = new LinkedList();
    }

    private List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);
    }
}
