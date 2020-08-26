/* Dallin Savage
 * 8/20/20
 */

import java.util.Date;
import java.util.Scanner;
public abstract class GeometricObject {
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
	public abstract double getArea();
	public abstract double getPerimeter();
}
	interface Colorable {
		public abstract void howToColor();
	}

	class Triangle extends GeometricObject implements Colorable {
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
			Triangle(String newColor, boolean newFilled, double newSide1, double newSide2, double newSide3) {
				super(newColor, newFilled);
				this.side1 = newSide1;
				this.side2 = newSide2;
				this.side3 = newSide3;
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
			public double getArea() {
				double s = (side1 + side2 + side3) / 2;
				double preArea = s * (s - side1) * (s - side2) * (s - side3);
				double area = Math.sqrt(preArea);
				return area;
			}
			public void howToColor() {
				System.out.println("Color all three sides");
			}
		}

class TestTriangle {		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GeometricObject[] geoArray = new GeometricObject[5];
		geoArray[0] = new Triangle(3, 4, 5);
		geoArray[1] = new Triangle(7, 10, 5);
		geoArray[2] = new Triangle(4, 6, 9);
		geoArray[3] = new Triangle(10, 10, 15);
		geoArray[4] = new Triangle(13, 19, 28);
		for (int i = 0; i < geoArray.length; i++) {
			System.out.println("Triangle " + i + " area = " + geoArray[i].getArea());
			((Colorable) geoArray[i]).howToColor();
		}
	}
}


















