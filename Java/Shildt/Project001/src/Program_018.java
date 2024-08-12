public class Program_018 {
    public static void main (String[] args)
        throws java.io.IOException {
        Main.title("do-while cycle");
        char choice;
        do {
            System.out.println("Briefing about: \n\t1. if\n\t2. switch" +
                    "\n\t3. while\n\t4. do-while\n\t5. for\n\n" +
                    "Choose the option: ");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Operator if:\n\tif (condition) operator;" +
                        "\n\telse operator;\n");
                break;
            case '2':
                System.out.println("Operator switch:\n\t" +
                        "switch (expression) {\n\t\tcase constant:\n\t\t\t" +
                        "operators sequence\n\t\t\tbreak;\n\t\t//...\n\t}");
                break;
            case '3':
                System.out.println("Operator while:\n\t" +
                        "while (condition) operator;\n");
                break;
            case '4':
                System.out.println("Operator do-while:\n\tdo {\n\t\t" +
                        "operator;\n\t} while (condition);\n");
                break;
            case '5':
                System.out.println("Operator for:\n\t" +
                        "for (initialization; condition; iteration)\n\t\toperator;\n");
                break;
        }
        int n;
        for (n = 10; n > 0; n--)
            System.out.print("n = " + n + "\t");
        System.out.println();
        for (int i = 10; i > 0; i--)
            System.out.print("i = " + i + "\t");
        System.out.println("\nChecking the number is Prime");
        int num;
        boolean isPrime;

        num = 17;
        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("The number is Prime!");
        else System.out.println("The number is not Prime!");

        int a, b;
        b = 4;
        for (a = 1; a < b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
        System.out.println();
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.print("a = " + a + "\tb = " + b + "\t");
        }
        System.out.println();
        boolean done = false;
        int i = 0;
        for ( ; !done; ) {
            System.out.print("i = " + i + "\t");
            if (i == 10) done = true;
            i++;
        }
        System.out.println();
    }
}
