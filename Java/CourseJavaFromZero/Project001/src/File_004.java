import java.util.*;

public class File_004 {

    public void tomorrow(Calendar cal) {
        System.out.printf("Calendar before is %tF\n", cal);
        cal.add(Calendar.DATE, 1);
        System.out.printf("Calendar after is %tF\n", cal);
    }


    public static void addOne(int x) {
        System.out.println("int before is " + x);
        x = x + 1;
        System.out.println("int after is " + x);
    }

    public void go() {
        Calendar cal = new GregorianCalendar();
        int x = 1;
        tomorrow(cal);
        addOne(x);

        System.out.printf("Calendar after is %tF\n", cal);
        System.out.println("int after is " + x);
    }

    public static void main(String[] args) {
        System.out.println("\n======Примитивные VS Ссылочные типы данных=======\n");

        int x = 42;
        System.out.println("int x = " + x + "\n");
        x = 52;
        System.out.println("new x = " + x + "\n");

        //Calendar cal;

        System.out.println("\npublic class File_004 {\n" +
                "\tpublic int numOne;\n" +
                "\tpublic long numTwo;\n}\n\n" +
                "File_004 m = new File_004();\n\nm.numOne\nm.numTwo\n\n" +
                "int value = m.numOne;\n" +
                "m.numTwo = 42;\n\n" +
                "File_004[] mc; <----- Ref to Array of File_004\n" +
                "mc[0]; <----- Ref to File_004\n" +
                "mc[0].numOne;\n\n" +
                "public class SecondClass {\n" +
                "\tpublic File_004 getOneClass() {\n" +
                "\t\treturn new File_004();\n\t}\n}\n\n" +
                "SecondClass sc = new SecondClass();\n" +
                "sc.gerOneClass() <----- ref to File_004\n" +
                "sc.getOneClass().numOne\n\n" +
                "public class FooBar {\n\tpublic int foo;\n" +
                "\tpublic void bar() {\n\t\tfoo = foo + 1;\n\t}\n}\n\n" +
                "FooBar fb1 = new Foobar();\nFooBar fb2 = new Foobar();\n");

    }
}
