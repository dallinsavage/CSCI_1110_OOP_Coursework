import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_32_17 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setHgap(15);
		pane.setVgap(10);
		Label amount = new Label("Investment Amount");
		TextField TFAmount = new TextField();
		TFAmount.setAlignment(Pos.CENTER_RIGHT);
		Label years = new Label("Number of Years");
		TextField TFYears = new TextField();
		TFYears.setAlignment(Pos.CENTER_RIGHT);
		Label rate = new Label("Annual Interest Rate");
		TextField TFRate = new TextField();
		TFRate.setAlignment(Pos.CENTER_RIGHT);
		Label value = new Label("Future Value");
		TextField TFValue = new TextField();
		TFValue.setAlignment(Pos.CENTER_RIGHT);
		Button calculate = new Button("Calculate");
		pane.addColumn(0, amount, years, rate, value);
		pane.addColumn(1, TFAmount, TFYears, TFRate, TFValue, calculate);
		pane.setAlignment(Pos.CENTER_RIGHT);
		
		calculate.setOnAction(e -> {
			double intAmount = Double.parseDouble(TFAmount.getText());
			double intRate = Double.parseDouble(TFRate.getText()) / 12 / 100 + 1;
			int intYears = Integer.parseInt(TFYears.getText());
			double futureValue = intAmount * Math.pow((intRate), intYears * 12);
			TFValue.setText(String.valueOf(futureValue));
		});
		
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
