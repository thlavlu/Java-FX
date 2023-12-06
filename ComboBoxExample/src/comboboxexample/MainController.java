/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package comboboxexample;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

/**
 * FXML Controller class
 *
 * @author thlav
 */
public class MainController implements Initializable {

    @FXML
    private ComboBox<String> combobox;
    ObservableList<String> list = FXCollections.observableArrayList("John","Kabir");
    @FXML
    private Label result;
    @FXML
    private Button additem;
    @FXML
    private ListView<String> listview;
    @FXML
    private Button btnselected;
    

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.setItems(list);
        listview.setItems(list);
        listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    

    @FXML
    private void ComboChange(ActionEvent event) {
    result.setText(combobox.getValue());
    }

    @FXML
    private void additems(ActionEvent event) {
    
    combobox.getItems().addAll("Max","Robert");
    }

    @FXML
    private void showSelected(ActionEvent event) {
    
    
     ObservableList<String> names;
       names = listview.getSelectionModel().getSelectedItems();
      for(String name : names){
          System.err.println(" "+name);
      }
    }
    
      
    
}
