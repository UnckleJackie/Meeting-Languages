package Seminars.Seminar_01.Program_010;

import java.util.List;

public interface VendingMachine {
    void initProducts (List<Product> list);
    Product getProduct(String name);
}
