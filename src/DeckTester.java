/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"one", "two", "three"};
		String[] suit1 = {"hearts", "spades", "diamonds"};
		int[] value1 = {1, 2, 3};
		Deck deck1 = new Deck(rank1, suit1, value1);
		System.out.println(deck1.size());

		String[] rank2 = {"jack", "king", "queen"};
		String[] suit2 = {"hearts", "spades", "diamonds"};
		int[] value2 = {10, 10, 10};
		Deck deck2 = new Deck(rank2, suit2, value2);
		System.out.println(deck2.size());

		String[] rank3 = {"nine", "four", "six"};
		String[] suit3 = {"hearts", "spades", "diamonds"};
		int[] value3 = {9, 4, 6};
		Deck deck3 = new Deck(rank3, suit3, value3);
		System.out.println(deck3.size());
	}
}
