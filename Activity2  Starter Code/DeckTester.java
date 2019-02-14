/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
   String[] ranks = {"Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2"};
   String[] suits = {"Clubs","Spades","Diamonds","Hearts"};
   int[] values = {14,13,12,11,10,9,8,7,6,5,4,3,2};
   Deck run = new Deck(ranks, suits, values);
   System.out.println(run.size());
   System.out.println(run.deal());
 }
}

