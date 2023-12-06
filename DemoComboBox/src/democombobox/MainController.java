/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package democombobox;

import java.net.URL;
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

/**
 * FXML Controller class
 *
 * @author thlav
 */
public class MainController implements Initializable {

    @FXML
    private ComboBox<String> combobox;
    ObservableList<String> list = FXCollections.observableArrayList("John", "Wick");
    @FXML
    private Label result;
    @FXML
    private Button additem;
    @FXML
    private ListView<String> listview;
    @FXML
    private Button btnshow;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.setItems(list);
        listview.setItems(list);
        
    }    

    @FXML
    private void showitemonlabel(ActionEvent event) {
    result.setText(combobox.getValue());
    System.out.println(combobox.getValue());
    
    }

    @FXML
    private void additemaction(ActionEvent event) {
   combobox.getItems().addAll("Smith");
    }

    @FXML
    private void showitemondisplay(ActionEvent event) {
    ObservableList<String> names;
    names = listview.getSelectionModel().getSelectedItems();
    
    for(String name : names){
    
    System.out.println(name);
    }
    
    }
    
}
