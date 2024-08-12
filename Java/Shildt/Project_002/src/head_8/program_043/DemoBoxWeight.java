package head_8.program_043;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(); // standard
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        double vol;

        vol = mybox1.volume();
        System.out.println("\nVolume mybox1 is " + vol +
                "\nWeight mybox1 is " + mybox1.weight + "\n");

        vol = mybox2.volume();
        System.out.println("Volume mybox2 is " + vol +
                "\nWeight mybox2 is " + mybox2.weight + "\n");

        vol = mybox3.volume();
        System.out.println("Volume mybox3 is " + vol +
                "\nWeight mybox3 is " + mybox3.weight + "\n");

        vol = mycube.volume();
        System.out.println("Volume mycube is " + vol +
                "\nWeight mycube is " + mycube.weight + "\n");

        vol = myclone.volume();
        System.out.println("Volume myclone is " + vol +
                "\nWeight myclone is " + myclone.weight + "\n");

        vol = weightbox.volume();
        System.out.println("Volume weightbox is " + vol + "\n" +
                "Weight weightbox is " + weightbox.weight + "\n");

        Box plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Volume plainbox is " + vol);
        // System.out.println("Weight plainbox is " + plainbox.weight);
    }
}
