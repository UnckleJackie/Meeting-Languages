package seminars.sem3.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * @apiNote Даны сведения об экспортируемых товарах: указывается наименование товара, страна,
         * экспортируемый товар и объем поставляемой партии в штуках.
         * Найти страны, которые экспортируют данный товар (введенный с клавиатуры) и
         * общий объем его экспорта.
         */
        Item item1 = new Item("spoon", "ru", 10000);
        Item item2 = new Item("fork", "ru", 10000);
        Item item3 = new Item("knife", "ru", 10000);
        Item item4 = new Item("fork", "en", 9000);
        Item item5 = new Item("knife", "en", 129000);
        Item item6 = new Item("cup", "us", 10000);
        Item item7 = new Item("omega-3", "us", 50000);

        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nSearch: ");
        String search = scanner.nextLine();

        ArrayList<Integer> volume = new ArrayList();

        ArrayList<String> country = new ArrayList();
        Integer sumVolume = 0;
        for (int i = 0; i < itemList.size(); i++) {
            Item item = itemList.get(i);
        }
        for (Item elem : itemList) {
            if (elem.getName().equals(search)) {
                sumVolume += elem.getVolume();
                country.add(elem.getCountry());
                volume.add(elem.getVolume());
            }
        }
        System.out.println(sumVolume);
        System.out.println("country = " + country);
        System.out.println("volume = " + volume);
    }
}
