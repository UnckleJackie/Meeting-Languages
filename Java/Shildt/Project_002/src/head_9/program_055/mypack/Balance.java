package head_9.program_055.mypack;
/* Now class Balance, his constructor and method show() became public.
It means they can be using in class code outside their package
 */
public class Balance {
    String name;
    double bal;
    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
}
