/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package loginverifiy;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author thlav
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       
        if(event.getSource()==button){
            String userid=username.getText();
            
            String userpass=password.getText();
            
            if(userid=="admin" && userpass=="admin"){
             
                
            //Stage primaryStage = new Stage();
            //Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            //Scene scene = new Scene(root);
            //primaryStage.setScene(scene);
            //primaryStage.show();
            //primaryStage.setTitle("Dashboard");
              
              
                System.out.println("Login Success.");
            }
            
            
            else{
            System.out.println("Unsuccessfull");
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
