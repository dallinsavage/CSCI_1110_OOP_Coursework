/* Dallin Savage
 * 1/25/21
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TabPaneDemo extends Application {   
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {  
	BorderPane pane = new BorderPane();
	TabPane tabPane = new TabPane();
    Tab tab1 = new Tab("Line");
    StackPane pane1 = new StackPane();
    pane1.getChildren().add(new Line(10, 10, 80, 80));
    tab1.setContent(pane1);
    Tab tab2 = new Tab("Rectangle");
    tab2.setContent(new Rectangle(10, 10, 200, 200));
    Tab tab3 = new Tab("Circle");
    tab3.setContent(new Circle(50, 50, 20));    
    Tab tab4 = new Tab("Ellipse");
    tab4.setContent(new Ellipse(10, 10, 100, 80));
    tabPane.getTabs().addAll(tab1, tab2, tab3, tab4);
    RadioButton top = new RadioButton("Top");
    RadioButton left = new RadioButton("Left");
    RadioButton bottom = new RadioButton("Bottom");
    RadioButton right = new RadioButton("Right");
    ToggleGroup group = new ToggleGroup();
    top.setToggleGroup(group);
    left.setToggleGroup(group);
    bottom.setToggleGroup(group);
    right.setToggleGroup(group);
    HBox hBox = new HBox(30, top,left, bottom, right);
    pane.setTop(tabPane);
    pane.setBottom(hBox);
    
    top.setOnAction(e -> {
    	tabPane.setSide(Side.TOP);
    });
    left.setOnAction(e -> {
    	tabPane.setSide(Side.LEFT);
    });
    bottom.setOnAction(e -> {
    	tabPane.setSide(Side.BOTTOM);
    });
    right.setOnAction(e -> {
    	tabPane.setSide(Side.RIGHT);
    });
    
    Scene scene = new Scene(pane, 300, 300);
    primaryStage.setTitle("DisplayFigure"); // Set the window title
    primaryStage.setScene(scene); // Place the scene in the window
    primaryStage.show(); // Display the window
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   * line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}