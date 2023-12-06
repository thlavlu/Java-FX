
package javafx.crud.app;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author thlavlu
 */
public class FXMLDocumentController implements Initializable {

    private TextField tfId;
    @FXML
    private TextField tfTitle;
    @FXML
    private TextField tfAuthor;
    @FXML
    private TextField tfYear;
    @FXML
    private TextField tfPages;
    @FXML
    private TableView<Books> tvBooks;
    @FXML
    private TableColumn<Books, Integer> colId;
    @FXML
    private TableColumn<Books, String> colTitle;
    @FXML
    private TableColumn<Books, String> colAuthor;
    @FXML
    private TableColumn<Books, Integer> colYear;
    @FXML
    private TableColumn<Books, Integer> colPages;
    @FXML
    private Button btnInsert;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnInsert) {
            insert();
        }
        else if (event.getSource() == btnUpdate) {
            update();
        }
        if (event.getSource() == btnDelete) {
            delete();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showBooks();
    }

    //connection function to database
    public Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            return con;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public ObservableList<Books> getBooksList() {
        ObservableList<Books> bookList = FXCollections.observableArrayList();
        
        
        
        Connection con = getConnection();
        
        
        
        String query = "SELECT * FROM books";
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Books books;
            while (rs.next()) {
                books = new Books(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getInt("year"), rs.getInt("pages"));
                bookList.add(books);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bookList;
    }

    
    
    public void showBooks() {
        ObservableList<Books> list = getBooksList();

        colId.setCellValueFactory(new PropertyValueFactory<Books, Integer>("id"));
        colTitle.setCellValueFactory(new PropertyValueFactory<Books, String>("title"));
        colAuthor.setCellValueFactory(new PropertyValueFactory<Books, String>("author"));
        colYear.setCellValueFactory(new PropertyValueFactory<Books, Integer>("year"));
        colPages.setCellValueFactory(new PropertyValueFactory<Books, Integer>("page"));

        tvBooks.setItems(list);
    }

    //Operation
    
    //insert
    private void insert() {
        String query = "INSERT INTO books VALUES (" + tfId.getText() + ",'" + tfTitle.getText() + "','" + tfAuthor.getText() + "',"
                + tfYear.getText() + "," + tfPages.getText() + ")";

        executeQuery(query);
        showBooks();
    }
    
    
    //update
    private void update(){
        String query = "UPDATE  books SET title  = '" + tfTitle.getText() + "', author = '" + tfAuthor.getText() + "', year = " +
                tfYear.getText() + ", pages = " + tfPages.getText() + " WHERE id = " + tfId.getText() + "";
        executeQuery(query);
        showBooks();
    }
    
    //delete
    private void delete(){
        String query = "DELETE FROM books WHERE id =" + tfId.getText() + "";
        executeQuery(query);
        showBooks();
    }
    
    

    private void executeQuery(String query) {
        Connection con = getConnection();
        Statement st;
        try {
            st = con.createStatement();
            st.executeUpdate(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
