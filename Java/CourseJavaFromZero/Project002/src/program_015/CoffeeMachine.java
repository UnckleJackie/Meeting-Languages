package program_015;

public class CoffeeMachine {
    private String coffeeName;
    private double money;
    private double priceOfCoffee = 7.00;

    public void makeCoffee() {
        if (getCoffeeName() == "espresso" && getMoney() >= priceOfCoffee) {
            double change = Math.abs(priceOfCoffee - money);
            System.out.println("Your coffee " + getCoffeeName() + " and " + change + " change!");
        } else {
            System.out.println("Nor enough money, please add more");
        }
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}