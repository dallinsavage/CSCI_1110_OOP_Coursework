/* Dallin Savage
 * 8/3/20
 * area of a triangle
 */
import java.util.Scanner;

public class Exercise_6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of the 3 sides of the triangle");
		Scanner input = new Scanner(System.in);
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if (isValid(side1, side2, side3) == true) {
			double area = area(side1, side2, side3);
			System.out.printf("Side 1: " + side1 + "\n" + "Side 2: " + side2 + "\n" + "Side 3: " + side3 + "\n" + "Area: " + area);
		}
		else {
			System.out.println("That is not a valid triangle");
		}
	}
	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt((s * (s - side1) * (s - side2) *(s - side3)));
		return area;
	}

}
