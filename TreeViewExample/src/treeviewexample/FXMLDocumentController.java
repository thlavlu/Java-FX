/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package treeviewexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author thlav
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    TreeView<String> TreeView;
  
   
    public void initialize(URL url, ResourceBundle rb) {
        TreeItem<String>  root  = new TreeItem<>("This PC");
        TreeItem<String> node1 = new TreeItem<>("Documents");
        TreeItem<String> node2 = new TreeItem<>("Pictures");
        TreeItem<String> node3 = new TreeItem<>("Download");
        
        TreeItem<String> node11 = new TreeItem<>("Academic");
        TreeItem<String> node12 = new TreeItem<>("Office");
        
        node1.getChildren().addAll(node11,node12);
        root.getChildren().addAll(node1,node2);
        TreeView.setRoot(root);
    
    }    

    //@FXML
   // private void OnClick(MouseEvent event) {
   //TreeItem<String> item = TreeView.getSelectionModel().getSelectedItem();
   //System.out.println(item.getValue());
    
   // }
    
}
