package hellofx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorView {
	
	public TextField arg1;  
	public TextField arg2;
	
	public Button add; 
	public Button sub; 
	public Button mul;
	public Button div; 
	public Button log; 
	public Button clr; 
	
	public Label output;
	
	CalculatorView(Stage stage) {
    	stage.setTitle("Calculator");
    	VBox root = new VBox(); 

    	Label label1 = new Label("Argument 1"); 
    	TextField arg1 = new TextField();
    	
    	Label label2 = new Label("Argument 2"); 
    	TextField arg2 = new TextField();
    	
    	Scene scene = new Scene(root, 400, 400); 
    	stage.setScene(scene);

    	Label output = new Label("--");

    	this.arg1 = arg1; 
    	this.arg2 = arg2; 
    	this.output = output; 
    	
    	HBox buttons = new HBox(); 
    	
    	Button addBtn = new Button("+");
    	Button subBtn = new Button("-");	
    	Button mulBtn = new Button("*"); 
    	Button divBtn = new Button("/");
    	Button logBtn = new Button("log"); 	
    	Button clrBtn = new Button("AC");
  	
    	add = addBtn; 
    	sub = subBtn; 
    	mul = mulBtn; 
    	div = divBtn; 
    	log = logBtn; 
    	clr = clrBtn; 
    	
    	buttons.getChildren().addAll(addBtn, subBtn, mulBtn, divBtn, logBtn, clrBtn);
    	
    	root.getChildren().addAll(label1, arg1, label2, arg2, output, buttons); 
    	stage.show(); 
	}
	
}
