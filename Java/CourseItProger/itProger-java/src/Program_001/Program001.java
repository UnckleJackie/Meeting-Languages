package Program_001;

public class Program001 {

    public static void main(String[] args) {
        System.out.println("\n==Variables and types of data==\n");
        System.out.println("\n---type INT---\n" +
                "\ttakes 4 bytes");
        int age;
        age = 56;

        age = 5;
        System.out.println("int age = " + age);

        int docks = -5;
        int excerciseBooks = 18;
        System.out.println("docs: " + docks + ", excerciseBooks: " +
               + excerciseBooks + ", age = " + age);
        age = 90;
        System.out.println(age);

        System.out.println("\n---type BYTE---\n" +
                "\ttakes 1 byte\n");

        byte ageGrand = 127;

        System.out.println("Ny granddad is " + ageGrand + " years old!");

        System.out.println("\n---type SHORT---\n" +
                "\ttakes 2 bytes\n");

        short numShort = 31000;
        System.out.println("Type short example: " + numShort);


        System.out.println("\n---type LONG---\n" +
                "\ttakes 8 bytes\n" +
                "Long type numbers are very very big! Trust wy word...");

        System.out.println("\n\n---type FLOAT---\n" +
                "\ttakes 4 bytes\n");

        float numFloat = 4.3454897f;
        System.out.println("Float number: " + numFloat);

        System.out.println("\n---type DOUBLE---\n" +
                "\t takes 8 bytes\n");

        double numDouble = 578392487.87284348785;
        System.out.println("Double number: " + numDouble);

        System.out.println("\n---type CHAR---\n" +
                "\ttakes 2 bytes\n");

        char ch = 'h';
        System.out.println("Char 'ch' = " + ch);

        System.out.println("\n---type STRING---\n");

        String str1 = "Jackson Mississippi!";
        System.out.println("String = " + str1);

        System.out.println("\n---type BOOLEAN---\n" +
                "\ttakes ONLY 1 BIT of information\n");

        boolean isSnow = true;
        System.out.println("Boolean 'isSnow' = " + isSnow +
                "\n\n=============THE END!=================\n");


    }

}
