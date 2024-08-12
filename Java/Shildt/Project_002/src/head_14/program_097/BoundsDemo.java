package head_14.program_097;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = { 1, 2, 3, 4, 5 };
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Average value iob is " + v);
        Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Average value dob is " + w);

//        String[] strs = { "1", "2", "3", "4", "5" };
//        Stats<String> strob = new Stats<String>(strs);
//        double x = strob.average();
//        System.out.println("Average value strob is " + x);
    }
}
