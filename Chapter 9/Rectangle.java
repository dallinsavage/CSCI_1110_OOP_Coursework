/* Dallin Savage
 * 8/4/20
 */

public class Rectangle {
	double width = 1;
	double height = 1;
	Rectangle() {
	}
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	double getArea() {
		return width * height;
	}
	double getPerimeter() {
		return (width * 2) + (height *2);
	}
}
	class testRectangle{
		public static void main(String[] args) {
			Rectangle rec1 = new Rectangle(4, 40);
			Rectangle rec2 = new Rectangle(3.5, 35.9);
			System.out.println("Rectangle 1: width-" + rec1.width + "  Height-" + rec1.height + "  Area-" + rec1.getArea() + "  Perimeter-" + rec1.getPerimeter());
			System.out.println("Rectangle 1: width-" + rec2.width + "  Height-" + rec2.height + "  Area-" + rec2.getArea() + "  Perimeter-" + rec2.getPerimeter());
		}
	}