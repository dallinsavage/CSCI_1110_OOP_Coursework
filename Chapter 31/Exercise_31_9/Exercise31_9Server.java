import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise31_9Server extends Application {
  private TextArea taServer = new TextArea();
  private TextArea taClient = new TextArea();
 
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    taServer.setWrapText(true);
    taClient.setWrapText(true);
    //taClient.setDisable(true);

    BorderPane pane1 = new BorderPane();
    pane1.setTop(new Label("History"));
    pane1.setCenter(new ScrollPane(taServer));
    BorderPane pane2 = new BorderPane();
    pane2.setTop(new Label("New Message"));
    pane2.setCenter(new ScrollPane(taClient));
    
    VBox vBox = new VBox(5);
    vBox.getChildren().addAll(pane1, pane2);

    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 200, 200);
    primaryStage.setTitle("Exercise31_09Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    taClient.requestFocus();

    new Thread(() -> {
    	try {
    		ServerSocket serverSocket = new ServerSocket(8000);
    		Socket socket = serverSocket.accept();
    		DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
        	DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
        	taClient.setOnKeyPressed(e -> {
        		switch (e.getCode()) {
        		case ENTER: taServer.appendText("S: " + taClient.getText().trim() + '\n');
					try {
						outputToClient.writeChars(taClient.getText().trim());
						taClient.clear(); break;
					} catch (IOException ex) {
						ex.printStackTrace();
					}
        		}
        	});
    	}
    	catch(IOException ex) {
    		ex.printStackTrace();
    	}
    }).start();
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
