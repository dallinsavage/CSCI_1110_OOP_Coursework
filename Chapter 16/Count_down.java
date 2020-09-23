
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Count_down extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField text = new TextField();
		Pane pane = new Pane();
		pane.getChildren().add(text);
		text.setAlignment(Pos.CENTER);
		text.setOnKeyPressed(e -> {
			e.getCode();
			if (e.getCode() == KeyCode.ENTER) {
				while (text.getText() != "0") {
				Timeline counting = new Timeline(
					new KeyFrame (Duration.seconds(1)));
				counting.setCycleCount(1);
				counting.play();
				text.setText(countDown(text.getText()));
				}
			}
		});
		
		
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Exercise 16-21");
		primaryStage.setScene(scene);
		primaryStage.show();
		text.requestFocus();
	}
	public String countDown(String currentNum) {
		int intValue = Integer.parseInt(currentNum);
		intValue = intValue - 1;
		String newNum = String.valueOf(intValue);
		return newNum;
	}

}
