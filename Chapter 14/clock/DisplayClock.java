  import javafx.application.Application;
  import javafx.geometry.Pos;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.control.Label;
  import javafx.scene.layout.BorderPane;
  import java.util.Random;

  public class DisplayClock extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
      // Create a clock and a label
       
    	int hour = (int)(Math.random() * 10 + Math.random() * 2);
        int min = (int)((Math.random() * 10) + (Math.random() * 10) + (Math.random() * 10));
      ClockPane clock = new ClockPane(hour, min, 0);
      clock.setSecondHandVisible(false);
      clock.paintClock();
      String timeString = clock.getHour() + ":" + clock.getMinute() 
        + ":" + clock.getSecond();
      Label lblCurrentTime = new Label(timeString);
  
      // Place clock and label in border pane
      BorderPane pane = new BorderPane();
      pane.setCenter(clock);
      pane.setBottom(lblCurrentTime);
      BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
  
      // Create a scene and place it in the stage
      Scene scene = new Scene(pane, 250, 250);
      primaryStage.setTitle("DisplayClock"); // Set the stage title
      primaryStage.setScene(scene); // Place the scene in the stage
      primaryStage.show(); // Display the stage
    }
    public static void main(String[] args) {
    	launch(args);
    }
    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
          .findFirst()
          .getAsInt();
    }
  }