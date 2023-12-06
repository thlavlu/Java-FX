/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package radiobutton02;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author thlav
 */
public class RadioButton02 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       VBox r = new VBox();
     r.getAlignment();
        // create a label
        Label l = new Label("This is a Radiobutton example ");
        //Label l2 = new Label("nothing selected");
        Button button = new Button("Submit");
  
        // create a toggle group
        ToggleGroup tg = new ToggleGroup();
  
        // create radiobuttons
        RadioButton r1 = new RadioButton("male");
        RadioButton r2 = new RadioButton("female");
        RadioButton r3 = new RadioButton("others");
  
        // add radiobuttons to toggle group
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
  
        // add label
        r.getChildren().add(l);
        r.getChildren().add(r1);
        r.getChildren().add(r2);
        r.getChildren().add(r3);
       // r.getChildren().add(l2);
        r.getChildren().add(button);
        
        
  
        // create a scene
        Scene sc = new Scene(r, 200, 200);
  
        // add a change listener
        /*
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() 
        {
            public void changed(ObservableValue<? extends Toggle> ob, 
                                                    Toggle o, Toggle n)
            {
  
                RadioButton rb = (RadioButton)tg.getSelectedToggle();
  
                if (rb != null) {
                    String s = rb.getText();
                    // change the label
                    l2.setText(s + " selected");
                }
            }
        });
        */
        
        button.setOnAction(new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent event) {
               RadioButton rb = (RadioButton)tg.getSelectedToggle();
              System.out.println(rb.getText());
           }
    
    
    });
  
        // set the scene
        primaryStage.setScene(sc);
  
        primaryStage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
