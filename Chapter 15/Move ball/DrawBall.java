import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DrawBall extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Ball ball = new Ball(100, 100, 20);
		HBox hBox = new HBox(15);
		Button leftButton = new Button("Left");
		Button rightButton = new Button("Right");
		Button upButton = new Button("Up");
		Button downButton = new Button("Down");
		hBox.getChildren().addAll(leftButton, rightButton, upButton, downButton);
		leftButton.setOnAction(e -> {
			ball.moveLeft();
		});
		rightButton.setOnAction(e -> {
			ball.moveRight();
		});
		upButton.setOnAction(e -> {
			ball.moveUp();
		});
		downButton.setOnAction(e -> {
			ball.moveDown();
		});
		BorderPane pane = new BorderPane();
		pane.setCenter(ball);
		pane.setBottom(hBox);
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Exercise 15_03");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
		
	}
    public static void main(String[] args) {
    	launch(args);
    }
}