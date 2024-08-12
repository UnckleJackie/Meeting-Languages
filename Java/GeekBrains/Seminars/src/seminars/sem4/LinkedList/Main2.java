package seminars.sem4.LinkedList;

import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        SingleLinkedList<Contact> contactList = new SingleLinkedList<>();

        contactList.addToEnd(new Contact(123, "Vasilyev", "+79008002530"));
        contactList.addToEnd(new Contact(141, "Konovalov", "+78621660618"));
        contactList.addToEnd(new Contact(332, "Kalinin", "+79659100989"));
        contactList.addToEnd(new Contact(432, "Zaskoyko", "+79610098989"));
        contactList.addToEnd(new Contact(556, "Stepanov", "+79038330088"));
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
        contactList.reverse();

        System.out.println("------------------");

        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    static class Contact {
        int id;
        String name;
        String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contact: " + "id = " + id + ", name = " + name +
                    '\'' + ", phone = " + phone + '\'' + '|';
        }
    }

    public static class SingleLinkedList<T> implements Iterable<T>{
        ListItem<T> head;
        ListItem<T> tail;

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {
                ListItem<T> current = head;

                @Override
                public boolean hasNext() {
                    return current != null;
                }
                @Override
                public T next() {
                    T data = current.data;
                    current = current.next;
                    return data;
                }
            };
        }
        private static class ListItem<T> {
            T data;
            ListItem<T> next;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void addToEnd(T Item) {
            ListItem<T> newItem = new ListItem<>();
            newItem.data = Item;
            if (isEmpty()) {
                head= newItem;
                tail = newItem;
            } else {
                tail.next = newItem;
                tail = newItem;
            }
        }
        public void reverse() {
            if (!isEmpty() && head.next != null) {
                tail = head;
                ListItem<T> current = head.next;
                head.next = null;
                while (current != null) {
                    ListItem<T> next = current.next;
                    current.next = head;
                    head = current;
                    current = next;
                }
            }
        }
    }
}
