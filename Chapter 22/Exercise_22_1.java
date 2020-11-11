/* Dallin Savage
 * 11/10/20
 * Maximum consecutive substring
 */
import java.util.Scanner;

public class Exercise_22_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = input.next() + " ";
		int minCounter = 0;
		int counter = 0;
		String minString = "";
		for (int i = 0; i < string.length() - 1; i++) {
			if (string.charAt(i) < string.charAt(i + 1)) {
				counter++;
			}
			else {
				if (counter >= minCounter) {
					minCounter = counter;
					minString = "";
					for (int x = counter; x >= 0 ; x--) {
						minString = minString + string.charAt(i - x);
					}
				}
				counter = 0;
			}
		}
		System.out.println("Maximum consecutive substring is: " + minString);
	}

}
