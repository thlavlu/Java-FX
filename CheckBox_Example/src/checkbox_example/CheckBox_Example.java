/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package checkbox_example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author thlav
 */
public class CheckBox_Example extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        CheckBox c1 = new CheckBox("Opiton1");
        CheckBox c2 = new CheckBox("Opiton2");
        CheckBox c3 = new CheckBox("Opiton3");
        CheckBox c4 = new CheckBox("Opiton4");
       // Button btn =new Button("Submit");
        
        
        HBox root = new HBox();
        root.setSpacing(10);
        root.getChildren().addAll(c1,c2,c3,c4);
        root.getChildren().add(new Button("Submit"));
        
        Scene scene = new Scene(root, 300, 400);
        
        primaryStage.setTitle("ChechBox Example");
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
