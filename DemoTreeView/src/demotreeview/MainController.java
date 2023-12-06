/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package demotreeview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author thlav
 */
public class MainController implements Initializable {

    @FXML
    private TreeView<String> treeview;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TreeItem<String> root = new TreeItem<>("This PC");
        
        TreeItem<String> DriveC = new TreeItem<>("Drive C");
        TreeItem<String> DriveD = new TreeItem<>("Drive D");
        TreeItem<String> DriveE = new TreeItem<>("Drive E");
        TreeItem<String> DriveF = new TreeItem<>("Drive F");
        
        
        TreeItem<String> Document = new TreeItem<>("Documents");
        TreeItem<String> Download = new TreeItem<>("Download");
        TreeItem<String> Video = new TreeItem<>("Videos");
        
        
        DriveC.getChildren().addAll(Document,Download,Video);
        
        root.getChildren().addAll(DriveC,DriveD,DriveE,DriveF);
        treeview.setRoot(root);
    }    
    
}
