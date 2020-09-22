/* Dallin Savage
 * 9/22/20
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GUI extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane pane = new BorderPane();
		
		// make buttons
		ToggleGroup color = new ToggleGroup();
		RadioButton rbBlue = new RadioButton("Blue");
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbBlack = new RadioButton("Black");
		rbBlue.setToggleGroup(color);
		rbGreen.setToggleGroup(color);
		rbYellow.setToggleGroup(color);
		rbBlack.setToggleGroup(color);
		rbBlue.setSelected(true);
		Button btLeft = new Button("<=");
		Button btRight = new Button("=>");
		Text label = new Text(200, 250, "Programming is fun");
		label.setFill(Color.BLUE);
		
		//positions
		HBox top = new HBox(50);
		HBox bottom = new HBox(25);
		top.getChildren().addAll(rbBlue, rbGreen, rbYellow, rbBlack);
		bottom.getChildren().addAll(btLeft, btRight);
		pane.setTop(top);
		pane.setBottom(bottom);
		pane.getChildren().add(label);
		bottom.setAlignment(Pos.CENTER);
		top.setAlignment(Pos.CENTER);
		
		
		// button events
		rbBlue.setOnAction(e -> {
			label.setFill(Color.BLUE);
		});
		rbGreen.setOnAction(e -> {
			label.setFill(Color.GREEN);
		});
		rbYellow.setOnAction(e -> {
			label.setFill(Color.YELLOW);
		});
		rbBlack.setOnAction(e -> {
			label.setFill(Color.BLACK);
		});
		btLeft.setOnAction(e -> {
			if (label.getX() >= 10) {
				label.setX(label.getX() - 10);
			}
		});
		btRight.setOnAction(e -> {
			if (label.getX() <= 385) {
				label.setX(label.getX() + 10);
			}
		});
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Exercise 16-1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
