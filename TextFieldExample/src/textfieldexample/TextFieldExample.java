/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package textfieldexample;

import java.awt.Checkbox;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author thlav
 */
public class TextFieldExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         Label Title =  new Label("Sample Form");
        // Title.setFont(Font.font(15));
         
        BorderPane border = new BorderPane();
       Label userID =  new Label("UserID");
       Label password =  new Label("Password");
        TextField tf1 = new TextField();
        PasswordField tf2 = new  PasswordField();
       
        GridPane root = new GridPane();
        root.setHgap(5); 
        root.setVgap(5);
       // root.setPadding(new Insets(10, 10, 10, 30));
       // root.setAlignment(Pos.TOP_CENTER);
        
        border.setTop(root);
       
        /*
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("UserID "+tf1.getText()+" Password "+tf2.getText());
            }
        });
        */
        
        root.addRow(0,Title);
        root.addRow(1, userID,tf1);
        root.addRow(2, password,tf2);
        
        //RadioButton

        Label Question =  new Label("Choose the right answer from beleo.");
        ToggleGroup group = new ToggleGroup();
      
        RadioButton btn1= new RadioButton("Option 1");
        RadioButton btn2= new RadioButton("Option 2");
        RadioButton btn3= new RadioButton("Option 3");
        RadioButton btn4= new RadioButton("Option 4");
        btn1.setToggleGroup(group);
        btn2.setToggleGroup(group);
        btn3.setToggleGroup(group);
        btn4.setToggleGroup(group);
        
        
        
        VBox vbox2 = new VBox();
        border.setCenter(vbox2);
        vbox2.setPadding(new Insets(10, 10, 10, 50));
        Button button = new Button("Submit");
        
        vbox2.getChildren().addAll(Question,btn1,btn2,btn3,btn4,button);
       
        Scene scene = new Scene(border, 300, 400);
        primaryStage.setTitle("Text Field");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
