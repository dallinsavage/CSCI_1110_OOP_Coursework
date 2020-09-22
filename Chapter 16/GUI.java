import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUI extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane pane = new BorderPane();
		RadioButton rbBlue = new RadioButton("Blue");
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbBlack = new RadioButton("Black");
		HBox hBox = new HBox(500/8);
		hBox.getChildren().addAll(rbBlue, rbGreen, rbYellow, rbBlack);
		pane.setTop(hBox);
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Exercise 16-1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
