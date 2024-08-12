package head_12.program_081;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;
        dOb = dOb + iOb;
        System.out.println("dOb after counting expression: " + dOb);

        Integer iOb2 = 2;
        switch(iOb2) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Error!");
        }
    }
}
