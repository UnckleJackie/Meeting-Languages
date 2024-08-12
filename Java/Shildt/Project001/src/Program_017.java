public class Program_017 {
    public static void main (String[] args) {
        Main.title("while, for, do-while cycles");
        System.out.println("While - самый фундаментальный оператор итерации в Java.\n" +
                "Он повторяет выполнение блока до тех пор, пока истинно управляющее выражение.\n" +
                "\n\twhile (condition) {\n\t\t// body\n\t}\n\n" +
                "\tdo {\n\t\t// body\n\t} while (condition);\n");
        int n = 10;
        while (n > 0) {
            System.out.println("Impulse number " + n);
            n--;
        }

        System.out.println("\n---While cycle without body---\n");
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j);
        System.out.println("Average point is " + i + "\n");

        n = 6;
        do {
            System.out.println("Impulse number " + n);
            n--;
        } while (n > 0);

        n = 10;
        do {
            System.out.print(n + "\t");
        } while (--n > 0);
    }
}
