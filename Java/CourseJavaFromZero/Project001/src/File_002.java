public class File_002 {
    public static void main(String[] args) {

        System.out.println("\n=======Types of variables======\n" +
                " - local variables\n" +
                " - instance variables (create with 'new' and delete when object eliminates\n" +
                " - member variables\n" +
                "\n<access modifier>  <variable-type>  <variable-name>\n" +
                "\nfor example:\n\n" +
                "public void myMethod() {\n\n" +
                "\tprivate int x, z q;\n" +
                "\tpublic String y;\n" +
                "\tprotected int[] a;\n}\n\n");

        int a = 42;
        int b = 21;
        int c = a + b;

        int x = 123;
        byte y = 123;

        x = y;
        // y = x;


    }
}
