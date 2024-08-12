package head_12.program_076;
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class enumDemo {
        public static void main(String[] args) {
            Apple ap;
            ap = Apple.RedDel;
            System.out.println("\nValue ap: " + ap + "\n");
            ap = Apple.GoldenDel;
            if (ap == Apple.GoldenDel)
                System.out.println("ap contents GoldenDel.\n");
            switch(ap) {
                case Jonathan:
                    System.out.println("Jonathan sort apples have red color");
                    break;
                case GoldenDel:
                    System.out.println("GoldenDel sort apples have yellow color");
                    break;
                case RedDel:
                    System.out.println("Red delicious sort apples have red color");
                    break;
                case Winesap:
                    System.out.println("Winesap sort apples have red color");
                    break;
                case Cortland:
                    System.out.println("Cortland sort apples have red color");
                    break;

        }
    }
}