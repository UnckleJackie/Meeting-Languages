public class Program_021 {
    public static void main (String[] args) {
        Main.title("operators break, continue, return");
        for (int i = 0; i < 100; i++) {
            if (i == 10) break;
            System.out.print("i: " + i + "\t");
        }
        System.out.println("\nLoop is over!");

        int i = 0;
        while (i < 100) {
            if (i == 10) break;
            System.out.print("i: " + i + "\t");
            i++;
        }
        System.out.println("\nLoop is over!");

        for (i = 0; i < 3; i++) {
            System.out.print("pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break;
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("Loop is over!");

        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("\nBefore break operator");
                    if (t) break second; // out of block "second"
                    System.out.println("This operator wouldn't do");
                }
                System.out.println("This operator wouldn't do");
            }
            System.out.println("After block second.");
        }

        outer: for (i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer;
                System.out.print(j + " ");
            }
            System.out.println("This wouldn't output");
        }
        System.out.println("\nLoops are over.\n\n\t------Continue------\n");
        for (i = 0; i < 10; i++) {
            System.out.print(i + "\t");
            if (i % 2 == 0) continue;
            System.out.println("\t");
        }

        outer: for (i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print("\t" + (i * j));
            }
        }
        System.out.println();
    }
}
