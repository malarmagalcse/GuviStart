import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class shuffle {
    //Make it easier to find array items
    static int value = 0;
    static int suit = 1;
    static int remaining = 2;

    public static void main(String Args[]) {
            int[][] deck;

            String clabel;
            //number of decks to generate
            int deckcount = 1;
            int decksize = deckcount * 52;

            deck = new int[decksize][2];
            //loop through deck building until deck reaches card count
            for (int c = 0; c < decksize;) {
                for (int s = 0; s < 4; s++) {
                    for (int v = 1; v <= 13; v++) {
                        deck[c][value] = v;
                        deck[c][suit] = s;
                        System.out.println(getCard(deck[c]));
                        c++;
                    }
                }
                //test parameters for debugging
                //System.out.println(""+c);
                //pressAnyKeyToContinue();
            }

            System.out.println("\nSHUFFLING\n");

            int order[];
            order = new int[decksize];
            order = shuffle(decksize);

            for(int i = 0;i < decksize;i++) {
                System.out.println(getCard(deck[order[i]]));
            }
        }
    //method to get cards correct label
    public static String getCard(int[] card) {
            String c_label, s_name = "", v_name = "";
            //get suit name
            switch (card[suit]) {
                case 0:
                    s_name = "Clubs";
                    break;
                case 1:
                    s_name = "Diamonds";
                    break;
                case 2:
                    s_name = "Hearts";
                    break;
                case 3:
                    s_name = "Spades";
                    break;
            }
            //get card label
            if (card[value] > 10 || card[value] == 1) {
                switch (card[value]) {
                    case 1:
                        v_name = "ACE";
                        break;
                    case 11:
                        v_name = "Jack";
                        break;
                    case 12:
                        v_name = "Queen";
                        break;
                    case 13:
                        v_name = "King";
                        break;
                }
            } else {
                v_name = "" + card[value];
            }
            c_label = v_name + " of " + s_name;

            return c_label;

        }
        //shuffle deck
    public static int[] shuffle(int size) {
        Random rgen = new Random(); // Random number generator
        int[] order;
        order = new int[size];

        for(int i = 0; i < order.length; i++) {
            order[i] = i;   
        }


        for (int i = 0; i < order.length; i++) {
            int randomPosition = rgen.nextInt(order.length);
            int temp = order[i];
            order[i] = order[randomPosition];
            order[randomPosition] = temp;
        }

        return order;
    }
    private static void pressAnyKeyToContinue() {
        System.out.println("Press any key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {}
    }
}
