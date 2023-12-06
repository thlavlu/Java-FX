/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package tableviewdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author thlav
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableView<Employee> tableview;
    @FXML
    private TableColumn<Employee, Integer> id;
    @FXML
    private TableColumn<Employee, String> fname;
    @FXML
    private TableColumn<Employee, String> lname;
 
    @FXML
    private TableColumn<Employee, String> phone;
    
  public ObservableList<Employee> list = FXCollections.observableArrayList(
          
          new Employee(1, "John", "Wick", "01711222777"),
          new Employee(2, "John", "Smith", "01711333111"),
          new Employee(3, "Mitchell", "Starc", "01777888999")
  );
    
    @Override
  public void initialize(URL url, ResourceBundle rb) {
  id.setCellValueFactory(new  PropertyValueFactory<Employee,Integer>("id"));
  fname.setCellValueFactory(new  PropertyValueFactory<Employee,String>("firstName"));
  lname.setCellValueFactory(new  PropertyValueFactory<Employee,String>("lastName"));
  phone.setCellValueFactory(new  PropertyValueFactory<Employee,String>("phone"));
  
 tableview.setItems(list);  
    }    
}
