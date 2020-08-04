/* Dallin Savage
 * 8/3/20
 * Valid password
 */
import java.util.Scanner;

public class Exercise_6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password:");
		String s = input.next();
		boolean valid = isValid(s);
		if (valid == true) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invlid Password");
		}
	}
	public static boolean isValid(String s) {
	int length = s.length();
	int x = 0;
	int digit = 0;
	int letters = 0;
	int y = 0;
	boolean valid = false;
	while (x < s.length()) {
		char current = s.charAt(x);
		if (Character.isDigit(current)) {
			digit++;
			x++;
		}
		else if (Character.isLetter(current)) {
			letters++;
			x++;
		}
		else {
			y++;
			x++;
		}
	}
	if ((s.length() > 8) && (y == 0) && (digit >= 2)) {
		valid = true;
	}
	return valid;
	}

}
