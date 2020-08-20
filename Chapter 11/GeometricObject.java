/* Dallin Savage
 * 8/20/20
 */

import java.util.Date;
import java.util.Scanner;
public class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated = new Date();
	GeometricObject() {
	}
	GeometricObject(String newColor, boolean newFilled) {
		color = newColor;
		filled = newFilled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean newFilled) {
		filled = newFilled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
}

	class Triangle extends GeometricObject {
			private double side1;
			private double side2;
			private double side3;
			Triangle() {
			}
			Triangle(double newSide1, double newSide2, double newSide3) {
				side1 = newSide1;
				side2 = newSide2;
				side3 = newSide3;
			}
			public double getSide1() {
				return side1;
			}
			public double getSide2() {
				return side2;
			}
			public double getSide3() {
				return side3;
			}
			public double getPerimeter() {
				return side1 + side2 + side3;
			}
			public double gerArea() {
				double s = (side1 + side2 + side3) / 2;
				double preArea = s * (s - side1) * (s - side2) * (s - side3);
				double area = Math.sqrt(preArea);
				return area;
			}
			public String toString() {
				return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
			}
		}

class TestTriangle {		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side1");
		double side1 = input.nextDouble();
		System.out.println("Enter side2");
		double side2 = input.nextDouble();
		System.out.println("Enter side3");
		double side3 = input.nextDouble();
		Triangle tri1 = new Triangle(side1, side2, side3);
		tri1.setColor("blue");
		tri1.setFilled(true);
		System.out.println(tri1.toString());
		System.out.println("Area = " + tri1.gerArea());
		System.out.println("Perimeter = " + tri1.getPerimeter());
		System.out.println("Color = " + tri1.getColor());
		System.out.println("Triangle is Filled = " + tri1.isFilled());
		System.out.println("Date Created = " + tri1.getDateCreated());
	}
}