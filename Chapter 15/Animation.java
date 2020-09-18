import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Animation.Status;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Animation extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Polygon pentagon = new Polygon(250.0, 50.0, 350.0, 150.0, 325.0, 250.0, 175.0, 250.0, 150.0, 150.0);
		pentagon.setFill(Color.WHITE);
		pentagon.setStroke(Color.BLACK);
		Rectangle rectangle = new Rectangle(250, 250, 20, 40);
		rectangle.setFill(Color.BLUE);
		rectangle.setStroke(Color.BLACK);
		pane.getChildren().addAll(pentagon, rectangle);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.seconds(5.0));
		pt.setNode(rectangle);
		pt.setPath(pentagon);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
		FadeTransition ft = new FadeTransition(Duration.seconds(5.0), rectangle);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		pane.setOnMousePressed(e -> {
			if (pt.getStatus() == Status.RUNNING) {
				pt.pause();
				ft.pause();
			}
			else {
				pt.play();
				ft.play();
			}
		});
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("rectangle on a pentagon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
