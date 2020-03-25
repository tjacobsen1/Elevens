/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

		Card card1 = new Card("4", "Diamond", 3);
		Card card2 = new Card("2", "Spades", 6);
		Card card3 = new Card("4", "Diamond", 3);

		if (card1.matches(card2)) {
			System.out.println("One matches two");
		} else {
			System.out.println("One does not match two");
		}
		
		if (card1.matches(card3)) {
			System.out.println("One matches three");
		} else {
			System.out.println("One does not match three");
		}

		if (card2.matches(card3)) {
			System.out.println("Two matches three");
		} else {
			System.out.println("Two does not match three");
		}
	}
}
