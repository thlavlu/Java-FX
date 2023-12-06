/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package fxcalculatordemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    private long number1=0;
    private String operator = "";
    private boolean start= true;
    Model model = new Model();
    @FXML
    private VBox VBox;
    @FXML
    private StackPane StackPane;
    @FXML
    private Button btnnumber;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    @FXML
    private void ActionNumber(ActionEvent event) {
    if(start){
    label.setText("");
    start = false;
    }
    String value = ((Button)event.getSource()).getText();
    label.setText(label.getText() + value);
    }
    
    
    
    
    

    @FXML
    private void ActionOperator(ActionEvent event) {
    String value = ((Button)event.getSource()).getText();
    if(!value.equals("=")){
        if(!operator.isEmpty()){
        return;
        }
        operator = value;
        number1 = Long.parseLong(label.getText());
        label.setText("");
    }
    else{
        if(operator.isEmpty()){
        return;
        }
     Long  number2 = Long.parseLong(label.getText());
     
    float output = model.calculate(number1,number2,operator);
    label.setText(String.valueOf(output));
    }
    }
}
