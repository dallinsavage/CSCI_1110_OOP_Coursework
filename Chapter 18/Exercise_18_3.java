import java.util.Scanner;

public class Exercise_18_3 {

	
	public static int GCD(int m, int n) {
		if (m % n == 0) {
			return n;
		}
		else {
			return GCD(n, m % n);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int int1 = input.nextInt();
		System.out.println("Enter another integer");
		int int2 = input.nextInt();
		System.out.println("The greatest common divisor is " + GCD(int1, int2));
	}

}
