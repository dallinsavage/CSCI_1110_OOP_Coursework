import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_21_11 extends Application {
  private Map<String, Integer>[] mapForBoy = new HashMap[10];
  private Map<String, Integer>[] mapForGirl = new HashMap[10];
  
  Button btFindRanking = new Button("FindRanking");
  private ComboBox<Integer> cboYear = new ComboBox<>();
  private ComboBox<String> cboGender = new ComboBox<>();
  private TextField tfName = new TextField();
  private Label lblResult = new Label();
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    GridPane gridPane = new GridPane();
    gridPane.add(new Label("Select a year:"), 0, 0);
    gridPane.add(new Label("Boy or girl?"), 0, 1);
    gridPane.add(new Label("Enter a name:"), 0, 2);
    gridPane.add(cboYear, 1, 0);
    gridPane.add(cboGender, 1, 1);
    gridPane.add(tfName, 1, 2);
    gridPane.add(btFindRanking, 1, 3);
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setHgap(5);
    gridPane.setVgap(5);
	int x = 0;
    for (int i = 2001; i < 2010; i++) {
    	try {
    		URL url = new URL("http://liveexample.pearsoncmg.com/data/babynamesranking" + i + ".txt");
    		Scanner input = new Scanner(url.openStream());
    		HashMap boyMap  = new HashMap();
    		HashMap girlMap  = new HashMap();
    			while (input.hasNext()) {
    				int rank = input.nextInt();
    				String boy = input.next().toLowerCase();
    				int trash1 = input.nextInt();
    				String girl = input.next().toLowerCase();
    				int trash2 = input.nextInt();
    				boyMap.put(boy, rank);
    				girlMap.put(girl, rank);
    			}
    			mapForBoy[x] = boyMap;
    			mapForGirl[x] = girlMap;
    			x++;
    		}
    	catch(IOException ex) {
    	}
    }
   
	
	btFindRanking.setOnAction(e -> {
		int year = cboYear.getValue() - 2001;
		if (cboGender.getValue() == "Male" ) {
			System.out.println(mapForBoy[year].get(tfName.getText().toLowerCase()));
		}
		else {
			System.out.println(mapForGirl[year].get(tfName.getText().toLowerCase()));
		}
    });
  
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(gridPane);
    borderPane.setBottom(lblResult);
    BorderPane.setAlignment(lblResult, Pos.CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 370, 160);
    primaryStage.setTitle("Exercise21_11"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    for (int year = 2001; year <= 2010; year++) {
      cboYear.getItems().add(year);
    }
    cboYear.setValue(2001);
        
    cboGender.getItems().addAll("Male", "Female");
    cboGender.setValue("Male");
    
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
