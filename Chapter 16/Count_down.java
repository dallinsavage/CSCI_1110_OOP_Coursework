/* Dallin Savage
 * 9/23/20
 */

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
		EventHandler<ActionEvent> eventHandler = e -> {
			text.setText(countDown(text.getText()));
			if (text.getText().equals("0")) {
				animation.stop();
				sound.setCycleCount(Timeline.INDEFINITE);
				sound.play();
			}
		};
		animation.getKeyFrames().add(new KeyFrame(Duration.millis(1000), eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		text.setOnAction(e -> {
				animation.play();
				if (text.getText().equals("0")) {
					animation.stop();
				sound.setCycleCount(Timeline.INDEFINITE);
				sound.play();
				}
		});
		
		Pane pane = new Pane();
		pane.getChildren().add(text);
		text.setAlignment(Pos.CENTER);
		Scene scene = new Scene(pane);
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
