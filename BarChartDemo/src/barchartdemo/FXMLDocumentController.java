
package barchartdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private BarChart<String, Number> barchart;
    @FXML
    private NumberAxis yaxix;
    @FXML
    private CategoryAxis xaxix;
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        XYChart.Series<String,Number> series = new XYChart.Series<>();
        
        series.setName("Comparison");
        
        series.getData().add(new XYChart.Data<>("A",20));
         series.getData().add(new XYChart.Data<>("B",30));
         series.getData().add(new XYChart.Data<>("C",40));
         
         barchart.getData().add(series);
        
    }    
    
}
