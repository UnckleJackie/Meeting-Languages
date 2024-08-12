package Vasilyev_JavaForEverybody.Head_09;

public class Demo8 {
    static void generator(int n) {
        throw new MyException(n);
    }

    public static void main(String[] args) {
        try {
            try {
                generator(123);
            } catch (MyException e) {
                System.out.println(e.getMessage());
                throw e;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
