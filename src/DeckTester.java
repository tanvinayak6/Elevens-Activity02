/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
   String[] thing = {  "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
   String [] ok = { "hearts", "spades", "clubs", "diamonds"};
   int [] lol = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 10, 10 , 10};
   Deck deck = new Deck(thing, ok, lol);
   System.out.println(deck);
 }
}
