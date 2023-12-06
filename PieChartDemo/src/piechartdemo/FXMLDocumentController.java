/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package piechartdemo;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author thlav
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private PieChart pichart;
    @FXML
    private Button button;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
     ObservableList<Data>  list =  FXCollections.observableArrayList(
     new PieChart.Data("A",10),
     new PieChart.Data("B",20),
             new PieChart.Data("C",30),
     new PieChart.Data("D",5)
             
     
     );
     
     pichart.setData(list);
     
     /*
     for(final PieChart.Data data : pichart.getData()){
     data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
         @Override
         public void handle(MouseEvent event) {
           label.setText(String.valueOf(data.getPieValue()));
         }
     
     });
     
     
     }*/
    
}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
