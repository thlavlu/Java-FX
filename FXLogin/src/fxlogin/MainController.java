package fxlogin;

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
import javafx.stage.Stage;

public class MainController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button btnLogin;
    @FXML
    private PasswordField textUsername;
    @FXML
    private PasswordField textPassword;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if (event.getSource() == btnLogin) {
            String userName = textUsername.getText();
            String password = textPassword.getText();
            if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
               
                System.out.println("Successfully login");
                Stage primaryStage =new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
                
            }else
                System.out.println("Unable to login.");
            
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
