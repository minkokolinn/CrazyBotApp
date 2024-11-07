package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class CrazyBot implements Initializable{

    @FXML
    private TextField input;

    @FXML
    private ListView<String> output;

    @FXML
    private Label message;
    
    private Decision decision;
    
    
    public CrazyBot() {
		// TODO Auto-generated constructor stub
    	decision=new Decision();
	}

    @FXML
    void ask() {
    	String question=input.getText();
    	String answer=decision.ask(question);
    	
    	output.getItems().add(question);
    	output.getItems().add(answer);
    	output.getItems().add("");
    	
    	input.clear();
    	message.setText("Memorize Words : "+decision.size());
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		message.setText("Memorize Word : "+decision.size());
	}    

}
