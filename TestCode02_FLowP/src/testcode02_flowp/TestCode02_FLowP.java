/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package testcode02_flowp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author thlav
 */
public class TestCode02_FLowP extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        root.setVgap(100);
        root.setHgap(10);
        
        root.setPrefWrapLength(50);
        
        root.getChildren().add(new Button("Start"));
        root.getChildren().add(new Button("Stop"));
        root.getChildren().add(new Button("reset"));
        
        
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
