/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
  
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   Card deckOne= new Card("stephen", "spade", 10);
   System.out.println(deckOne);
   System.out.println(deckOne.rank());
   System.out.println(deckOne.suit());
   System.out.println(deckOne.pointValue());
 }
}

