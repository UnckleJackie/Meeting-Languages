package StructuresAndAlgoritmes_Lafore.Head_01.Listing_01;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bal = new BankAccount(100.00);
        System.out.print("Before transactions. ");
        bal.display();
        bal.deposit(74.35);
        bal.withdraw(20.00);
        System.out.print("After transactions. ");
        bal.display();
    }
}
