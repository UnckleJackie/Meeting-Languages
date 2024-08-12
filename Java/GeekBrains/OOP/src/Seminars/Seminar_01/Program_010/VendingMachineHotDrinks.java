package Seminars.Seminar_01.Program_010;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine {
    private List<HotDrinks> hotDrinksList;
    public VendingMachineHotDrinks() {
        this.hotDrinksList = new ArrayList<>();
    }

    @Override
    public void initProducts(List<Product> list) {

    }

    @Override
    public Product getProduct(String name) {
        for (Product product : hotDrinksList) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }
    public Product getProduct(String name, int volume, int temperature) {
        for (HotDrinks hotDrinks : hotDrinksList) {
            if (hotDrinks.getName().equals(name) &&
            hotDrinks.getTemperature() == temperature && hotDrinks.getVolume() == volume) {
                return hotDrinks;
            }
        }
        return null;
    }
    public void addHotDrinks(HotDrinks hotDrinks) {
        hotDrinksList.add(hotDrinks);
    }
}
