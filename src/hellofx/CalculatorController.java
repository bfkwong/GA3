package hellofx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CalculatorController {

	public CalculatorView view; 
	public CalculatorModel model; 
	
	CalculatorController(CalculatorView view, CalculatorModel model) {
		this.view = view; 
		this.model = model;
		
    	this.view.add.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			model.arg1 = view.arg1.getText(); 
    			model.arg2 = view.arg2.getText(); 
    			
    			Double arg1Double = Double.parseDouble(model.arg1); 
    			Double arg2Double = Double.parseDouble(model.arg2);
    			Double result = arg1Double + arg2Double; 
    			
    			model.result = result.toString(); 
    			
    			view.output.setText(model.result);
    		}
    	});
    	
    	this.view.sub.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			model.arg1 = view.arg1.getText(); 
    			model.arg2 = view.arg2.getText(); 
    			
    			Double arg1Double = Double.parseDouble(model.arg1); 
    			Double arg2Double = Double.parseDouble(model.arg2);
    			Double result = arg1Double - arg2Double; 
    			
    			model.result = result.toString(); 
    			
    			view.output.setText(model.result);
    		}
    	});
    	
    	
    	this.view.mul.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			model.arg1 = view.arg1.getText(); 
    			model.arg2 = view.arg2.getText(); 
    			
    			Double arg1Double = Double.parseDouble(model.arg1); 
    			Double arg2Double = Double.parseDouble(model.arg2);
    			Double result = arg1Double * arg2Double; 
    			
    			model.result = result.toString(); 
    			
    			view.output.setText(model.result);
    		}
    	});
    	
    	this.view.div.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			model.arg1 = view.arg1.getText(); 
    			model.arg2 = view.arg2.getText(); 
    			
    			Double arg1Double = Double.parseDouble(model.arg1); 
    			Double arg2Double = Double.parseDouble(model.arg2);
    			Double result = arg1Double / arg2Double; 
    			
    			model.result = result.toString(); 
    			
    			view.output.setText(model.result);
    		}
    	});
    	
    	this.view.log.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			model.arg1 = view.arg1.getText(); 
    			model.arg2 = view.arg2.getText(); 
    			
    			Double arg1Double = Double.parseDouble(model.arg1); 
    			Double arg2Double = Double.parseDouble(model.arg2);
    			Double result = Math.log(arg2Double) / Math.log(arg1Double); 
    			
    			model.result = result.toString(); 
    			
    			view.output.setText(model.result);
    		}
    	});
    	
    	this.view.clr.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent e) {
    			model.arg1 = ""; 
    			model.arg2 = ""; 
    			model.result = ""; 
    			
    			view.arg1.setText(model.arg1);
    			view.arg2.setText(model.arg2);
    			view.output.setText(model.result);
    		}
    	});
	}
	
}
