import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball extends Pane implements Observable {
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
    	x = x - 10;
    	drawBall();
    }
    public void moveRight() {
    	x = x + 10;
    	drawBall();
    }
    public void moveUp() {
    	y = y - 10;
    	drawBall();
    }
    public void moveDown() {
    	y = y + 10;
    	drawBall();
    }
	public void drawBall() {
	getChildren().clear();
	Circle ball = new Circle(x, y, radius);
	ball.setFill(Color.WHITE);
	ball.setStroke(Color.BLACK);
	getChildren().add(ball);
	}
	@Override
	public void addListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeListener(InvalidationListener listener) {
		// TODO Auto-generated method stub
		
	}
}
