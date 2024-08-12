package head_14.program_097;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer[] inums = { 1, 2, 3, 4, 5 };
        Stats2<Integer> iob = new Stats2<Integer>(inums);
        double v = iob.average();
        System.out.println("Average value iob is " + v);
        Double[] dums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats2<Double> dob = new Stats2<Double>(dums);
        double w = dob.average();
        System.out.println("Average value dob is " + w);
        Float[] fnums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
        Stats2<Float> fob = new Stats2<Float>(fnums);
        double x = fob.average();
        System.out.println("Average value fob is " + x);

        System.out.print("Average values iob and dob are ");
        if (iob.isSameAvg(dob))
            System.out.println("equals");
        else
            System.out.println("different");
        System.out.print("Average values iob and fob are ");
        if (iob.isSameAvg(fob))
            System.out.println("equals");
        else
            System.out.println("different");
    }
}
