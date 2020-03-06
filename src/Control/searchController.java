package Control;

import View.main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.DatabaseDriver;
import Model.LinkedList;
import Model.Product;

public class searchController implements Initializable {

	
	String selectedProduct;
    @FXML
    private Button homeBtn;

    @FXML
    private ListView<String> searchList;

    ObservableList<String> items = FXCollections.observableArrayList();
    
    @FXML
    void goHome(ActionEvent event) throws IOException {
        Parent freshViewParent = FXMLLoader.load(getClass().getResource("/View/mainUI.fxml"));
        Scene freshViewScene = new Scene(freshViewParent);

        //This line gets scene info
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(freshViewScene);
        window.show();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	
		searchList.setItems(items);
		LinkedList<Product> temp = ProgramDriver.getSearchList(ProgramDriver.getSearchTerm());
		Model.Node<Product> tNode = temp.firstNode;
		while(tNode != null) {
			items.add(tNode.toString());	
			tNode = tNode.getNext();
			
		
		}

	}
	
    @FXML
    void selectProduct(MouseEvent event) throws IOException {


        selectedProduct = searchList.getSelectionModel().getSelectedItem();
        ProgramDriver.SetSelProd(selectedProduct);


        Parent freshViewParent = FXMLLoader.load(getClass().getResource("/View/productUI.fxml"));
        Scene freshViewScene = new Scene(freshViewParent);

        //This line gets scene info
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(freshViewScene);
        window.show();



    }
}

