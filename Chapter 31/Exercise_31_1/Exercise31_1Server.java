// Exercise31_01Server.java: The server can communicate with
// multiple clients concurrently using the multiple threads
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Exercise31_1Server extends Application {
  // Text area for displaying contents
  private TextArea ta = new TextArea();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    ta.setWrapText(true);
   
    // Create a scene and place it in the stage
    Scene scene = new Scene(new ScrollPane(ta), 400, 200);
    primaryStage.setTitle("Exercise31_01Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    new Thread(() -> {
        try {
        	ServerSocket serverSocket = new ServerSocket(8000);
        	ta.appendText("Server Started" + '\n');
        	Socket socket = serverSocket.accept();
        	DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
        	DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
        	
        	while (true) {
        		double interestRate = inputFromClient.readDouble();
        		int years = inputFromClient.readInt();
        		double loanAmount =inputFromClient.readDouble();
        		Loan loan = new Loan(interestRate, years, loanAmount);
        		double monthlyPayment = loan.getMonthlyPayment();
        		double totalPayment =loan.getTotalPayment();
        		outputToClient.writeDouble(monthlyPayment);
        		outputToClient.writeDouble(totalPayment);
        		
        		ta.appendText("Interest Rate: " + interestRate + '\n');
        		ta.appendText("Years: " + years + '\n');
        		ta.appendText("Loan Amount: " + loanAmount + '\n');
        		ta.appendText("Monthly Payment: " + monthlyPayment + '\n');
        		ta.appendText("Total Payment: " + totalPayment + '\n');
        	}
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