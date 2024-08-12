package Head_04_Managing_Constructions;

import java.util.Random;

import static java.lang.System.out;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            out.print((char) c + ", " + c + ": ");
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': out.println("vowel");
                    break;
                case 'y':
                case 'w': out.println("a little vowel");
                    break;
                default: out.println("consonant");
            }
        }
    }
}
