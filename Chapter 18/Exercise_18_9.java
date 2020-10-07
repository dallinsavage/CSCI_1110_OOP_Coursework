/* Dallin Savage
 * 10/7/20
 * recursive reverse a string
 */

public class Exercise_18_9 {

	public static void reverseDisplay(String value) {
		if (value.length() - 1 == 0) {
			System.out.print(value.charAt(0));
		}
		else {
			System.out.print(value.charAt(value.length() - 1));
			value = value.substring(0, value.length() - 1);
			reverseDisplay(value);
		}
	}
	public static void main(String[] args) {
		reverseDisplay("reversed");

	}

}
