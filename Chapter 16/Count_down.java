/* Dallin Savage
 * 9/23/20
 */


import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Count_down extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
		Media media = new Media(MEDIA_URL);
		MediaPlayer sound = new MediaPlayer(media);
		TextField text = new TextField();
		Timeline animation = new Timeline();
		Pane pane = new Pane();
		pane.getChildren().add(text);
		text.setAlignment(Pos.CENTER);
		text.setOnKeyPressed(e -> {
			if (e.getCode().equals(KeyCode.ENTER)) {
				while (!text.getText().equals("0")) {
						text.setText(countDown(text.getText()));
						animation.play();
				}
				sound.play();
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
