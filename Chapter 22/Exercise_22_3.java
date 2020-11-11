/*Dallin Savage
 * 11/11/20
 * pattern matching
 */

import java.util.Scanner;

public class Exercise_22_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string s1: ");
		String s1 = input.nextLine();
		System.out.println("Enter a string s1: ");
		String s2 = input.nextLine();
		for (int i = 0; i < s1.length(); i++ ) {
			if (s1.charAt(i) == s2.charAt(0)) {
				for (int x = 0; x < s2.length(); x++) {
					if (s1.charAt(i + x) != s2.charAt(x)) {
						break;
					}
					else {
						if (x == s2.length() - 1) {
							System.out.println("Matched at index " + i);
						}
					}
				}
			}
		}
	}

}
