/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package piechartdemo02;

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
import javafx.scene.input.MouseEvent;

/**
 *
 * @author thlav
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private PieChart piechart;
    @FXML
    private Button button;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showpiechart(ActionEvent event) {
    
    ObservableList<Data> list = FXCollections.observableArrayList(
    
        new PieChart.Data("A",10),
             new PieChart.Data("B",20),
            
              new PieChart.Data("C",40),
             new PieChart.Data("D",50),
             new PieChart.Data("E",60)
    );
    
    piechart.setData(list);
    
    
    
    for(final PieChart.Data data : piechart.getData()){
     data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
         @Override
         public void handle(MouseEvent event) {
           label.setText(String.valueOf((data.getPieValue()/180)*100));
           
         }
     
     });
     
     
     }
    
    }
    
}
