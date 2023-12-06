/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package formexample;

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author thlav
 */
public class FormExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Label title = new Label("Login Form");
       Label userID =  new Label("UserID");
       Label password =  new Label("Password");
       TextField tf1 = new TextField();
       PasswordField tf2 = new  PasswordField();
       GridPane root = new GridPane();
       
       root.setAlignment(Pos.TOP_CENTER);
        
        root.setVgap(10);
        root.paddingProperty();
        Button button = new Button("Submit");
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("UserID "+tf1.getText()+" Password "+tf2.getText());
            }
        });
        Label Question = new Label("CheckBox");
        
        CheckBox c1= new CheckBox();
        CheckBox c2= new CheckBox();
        
        ToggleGroup group=new ToggleGroup();
        RadioButton rb= new RadioButton("Option1");
        RadioButton rb1= new RadioButton("Option2");
        rb.setToggleGroup(group);
        
        root.addRow(0,title);
        root.addRow(1, userID,tf1);
        root.addRow(2, password,tf2);
        //root.addRow(3,Question);
        root.addRow(4,c1,c2);
        root.addRow(5,rb);
        //root.addRow(3,button);
        
        
        
        HBox hbox = new HBox();
       // hbox.getChildren().addAll(hbox,c1,c2);
        
       
        
       
       
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Text Field");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
