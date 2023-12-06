/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package testcode03_radiobutton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author thlav
 */
public class TestCode03_RadioButton extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        ToggleGroup group = new ToggleGroup();
        RadioButton btn1= new RadioButton("Option1");
        RadioButton btn2= new RadioButton("Option2");
        RadioButton btn3= new RadioButton("Option3");
        RadioButton btn4= new RadioButton("Option4");
        btn1.setToggleGroup(group);
        btn2.setToggleGroup(group);
        btn3.setToggleGroup(group);
        btn4.setToggleGroup(group);
        
        VBox root =  new VBox();
        root.getChildren().addAll(btn1,btn2,btn3,btn4);
        root.getChildren().add(new Button("Submit"));
       Scene scene = new Scene(root, 300, 250);
     
        primaryStage.setTitle("Radio Button");
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
