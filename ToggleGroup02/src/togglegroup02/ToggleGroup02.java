/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package togglegroup02;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author thlav
 */
public class ToggleGroup02 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        ToggleGroup group =new ToggleGroup();
         TilePane r = new TilePane();
        
        
        Label l2 = new Label("nothing selected");
        
        RadioButton btn1 = new RadioButton("Option 1");
        RadioButton btn2 = new RadioButton("Option 2");
        RadioButton btn3 = new RadioButton("Option 3");
        RadioButton btn4 = new RadioButton("Option 4");
        
       btn1.setToggleGroup(group);
       btn1.setToggleGroup(group);
       btn1.setToggleGroup(group);
       btn1.setToggleGroup(group);
       
       
        r.getChildren().addAll(btn1,btn2,btn3,btn4);
       // r.getChildren().add(new Button("Submit"));
        
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() 
        {
            public void changed(ObservableValue<? extends Toggle> ob, 
                                                    Toggle o, Toggle n)
            {
  
                RadioButton rb = (RadioButton)group.getSelectedToggle();
  
                if (rb != null) {
                    String s = rb.getText();
  
                    // change the label
                    l2.setText(s + " selected");
                }
            }
        });
        
        Scene scene = new Scene(r, 300, 400);
        
        primaryStage.setTitle("Radio Button Example");
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
