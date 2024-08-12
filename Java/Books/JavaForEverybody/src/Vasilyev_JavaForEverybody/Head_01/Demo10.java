package Vasilyev_JavaForEverybody.Head_01;

public class Demo10 {
    public static void main(String[] args) {
        int num;
        char A = 'A',B = 'i';
        char X, Y;
        num = ((int)B << 16) + ((int)A);
        System.out.println("Initial literals: \'" + A + "\' and \'" + B + "\'.");
        System.out.println("Code number: " + num);
        Y = (char)(num >>> 16);
        X = (char)(num ^ ((int)Y << 16));
        System.out.println("Back transformation: ");
        System.out.println("Literals \'" + X + "\' and \'" + Y + "\'.");
    }
}
