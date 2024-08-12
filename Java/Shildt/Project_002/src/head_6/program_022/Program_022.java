package head_6.program_022;


class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("\nVolume is " + (width * height * depth));
        // System.out.print(width * height * depth);
    }
}

public class Program_022 {
    public static void main (String[] args) {
        mypackage.Methods.title("Introduction to classes");
        System.out.println("\n\tclass name-class {\n" +
                "\t\ttype of object variable1;\n" +
                "\t\ttype of object variable2;\n" +
                "\t\t// ... \n" +
                "\t\ttype of object variableN;\n" +
                "\n\t\ttype method-name1 (parameters list) {\n" +
                "\t\t\t// method body\n\t\t}\n" +
                "\t\ttype method-name2 (parameters list) {\n" +
                "\t\t\t// method body\n\t\t}\n\t\t// ...\n" +
                "\t\ttype method-nameN (parameters list) {\n" +
                "\t\t\t// method body\n\t\t}\n\t}\n" +
                "\nFor example:\n" +
                "\tclass head_6.program_022.Box {\n" +
                "\t\tdouble width;\n" +
                "\t\tdouble height;\n" +
                "\t\tdouble depth;\n\t}\n");
        Box mybox = new Box();
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double volume;
        mybox.width = 20;
        mybox.height = 50;
        mybox.depth = 30;
        // volume = mybox.width * mybox.height * mybox.depth;
        // System.out.println("Volume of mybox is " + volume);

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

//        volume = mybox1.width * mybox1.height * mybox1.depth;
//        System.out.println("Volume of mybox1 is " + volume);
//        volume = mybox2.width * mybox2.height * mybox2.depth;
//        System.out.println("Volume of mybox2 is " + volume);

        mybox.volume();
        mybox1.volume();
        mybox2.volume();
    }
}
