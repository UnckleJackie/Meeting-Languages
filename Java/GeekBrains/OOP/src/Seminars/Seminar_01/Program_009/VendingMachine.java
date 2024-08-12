package Seminars.Seminar_01.Program_009;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList = new ArrayList<>();

    public void initProducts(List<Product> list) {
        productList = list;
    }

    public Product getProduct(String name) {
        for (Product i : productList) {
            if (i.getName().equals(name))
                return i;
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
