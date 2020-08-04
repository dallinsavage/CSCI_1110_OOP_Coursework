/* Dallin Savage
 * 8/3/20
 * counting letters in a string
 */
import java.util.Scanner;

public class Exercise_6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = input.nextLine();
		int length = s.length();
		int letters = countLetters(s);
		System.out.println(s + " is " + length + " Charecters long");
		if (length != letters) {
			System.out.println("There are " + letters + " Letters in " + s);
		}
	}
	public static int countLetters(String s) {
		int x = 0;
		int counter = 0;
		
		while (x < s.length()) {
			char current = s.charAt(x);
			if ((s.charAt(x) >= 65 && s.charAt(x) <= 90)) {
				counter++;
				x++;
			}
			else if (s.charAt(x) >= 97 && s.charAt(x) <= 122) {
				counter++;
				x++;
			}
			else {
				x++;
			}
		}
		return counter;
	}
}
