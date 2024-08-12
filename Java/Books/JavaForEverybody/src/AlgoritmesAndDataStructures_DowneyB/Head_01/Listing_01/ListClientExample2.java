package AlgoritmesAndDataStructures_DowneyB.Head_01.Listing_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample2 {
    private List list;

    public ListClientExample2() {
        list = new ArrayList();
    }

    private List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample2 lce = new ListClientExample2();
        List list = lce.getList();
        System.out.println(list);
    }
}
