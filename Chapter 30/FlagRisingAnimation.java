import javafx.animation.PathTransition; 
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		// Create a pane
		Pane pane = new Pane();
		ImageView imageView = new ImageView("us.gif");

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 200); 
		primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		class Animation implements Runnable {

			@Override
			public void run() {
				PathTransition pt = new PathTransition(Duration.millis(10000),new Line(100, 200, 100, 0), imageView); pt.setCycleCount(5);
				pt.play();
			}
		}
		pane.getChildren().add(imageView);
		Runnable animation = new Animation();
		Thread thread = new Thread(animation);
		thread.start();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}