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
    	stage.setTitle("Calculator");
    	VBox root = new VBox(); 

    	Label label1 = new Label("Argument 1"); 
    	TextField arg1 = new TextField();
    	
    	Label label2 = new Label("Argument 2"); 
    	TextField arg2 = new TextField();
    	
    	Scene scene = new Scene(root, 400, 400); 
    	stage.setScene(scene);

    	Label output = new Label("--");
    	
    	HBox buttons = new HBox(); 
    	
    	Button addBtn = new Button("+");
    	
    	addBtn.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			Double arg1Double = Double.parseDouble(arg1.getText()); 
    			Double arg2Double = Double.parseDouble(arg2.getText());
    			Double result = arg1Double + arg2Double; 
    			
    			output.setText(result.toString());
    		}
    	});
    	
    	Button subBtn = new Button("-");
    	
    	subBtn.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			Double arg1Double = Double.parseDouble(arg1.getText()); 
    			Double arg2Double = Double.parseDouble(arg2.getText());
    			Double result = arg1Double - arg2Double; 
    			
    			output.setText(result.toString());
    		}
    	});
    	
    	Button mulBtn = new Button("*");
    	
    	mulBtn.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			Double arg1Double = Double.parseDouble(arg1.getText()); 
    			Double arg2Double = Double.parseDouble(arg2.getText());
    			Double result = arg1Double * arg2Double; 
    			
    			output.setText(result.toString());
    		}
    	});
    	
    	Button divBtn = new Button("/");
    	
    	divBtn.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			Double arg1Double = Double.parseDouble(arg1.getText()); 
    			Double arg2Double = Double.parseDouble(arg2.getText());
    			Double result = arg1Double / arg2Double; 
    			
    			output.setText(result.toString());
    		}
    	});
    	
    	Button logBtn = new Button("log"); 
    	
    	logBtn.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			Double arg1Double = Double.parseDouble(arg1.getText()); 
    			Double arg2Double = Double.parseDouble(arg2.getText());
    			Double result = Math.log(arg2Double) / Math.log(arg1Double); 
    			
    			output.setText("log" + arg1.getText()+ "(" + arg2.getText() + ") = " + result.toString());
    		}
    	});
    	
    	Button clrBtn = new Button("AC");
    	
    	clrBtn.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			arg1.setText("");
    			arg2.setText("");
    			output.setText("--");
    		}
    	});
    	
    	buttons.getChildren().addAll(addBtn, subBtn, mulBtn, divBtn, logBtn, clrBtn);
    	
    	root.getChildren().addAll(label1, arg1, label2, arg2, output, buttons); 
    	stage.show(); 
    }


    public static void main(String[] args) {
        launch(args);
    }
}
