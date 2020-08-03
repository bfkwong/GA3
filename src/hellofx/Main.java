package hellofx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
    	CalculatorView view = new CalculatorView(stage);
    	CalculatorModel model = new CalculatorModel(); 
    	
    	CalculatorController controller = new CalculatorController(view, model); 
    }


    public static void main(String[] args) {
        launch(args);
    }
}
