package head_9.program_061;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        // Method getNumber() can be called because it realised obviously in MyIFImp
        System.out.println(obj.getNumber());

        // Method getString() can be also called due to standard realization
        System.out.println(obj.getString());

        int defNum = MyIF.getDefaultNumber();
    }
}
