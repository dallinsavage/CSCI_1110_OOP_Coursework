/* Dallin Savage
 * 9/17/20
 */
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball extends Pane {
	private double x;
	private double y;
	private double radius;
	
	Ball(double newX, double newY, double newRadius) {
		x = newX;
		y = newY;
		radius = newRadius;
		Circle ball = new Circle(x, y, radius);
		drawBall();
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
    public void moveLeft() {
    	if (x >= 0 + radius) {
    	x = x - 10;
    	drawBall();
    	}
    }
    public void moveRight() {
    	if (x <= 250 - radius) {
    	x = x + 10;
    	drawBall();
    	}
    }
    public void moveUp() {
    	if (y >= 0 + radius) {
    	y = y - 10;
    	drawBall();
    	}
    }
    public void moveDown() {
    	if (y <= 250 - radius) {
    		y = y + 10;
    		drawBall();
    	}
    }
	public void drawBall() {
	getChildren().clear();
	Circle ball = new Circle(x, y, radius);
	ball.setFill(Color.WHITE);
	ball.setStroke(Color.BLACK);
	getChildren().add(ball);
	}
}
