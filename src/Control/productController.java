package Control;

import Model.*;
import View.main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class productController implements Initializable  {


    String selectedProd = "";
    String prodType = "";




    String name = "";
    Float price;
    String desc = "";

    @FXML
    private Button homeBtn;

    @FXML
    private Label productLbl;

    @FXML
    private ImageView imageBox;

    @FXML
    private Label priceLbl;

    @FXML
    private Label descLbl;

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
    public void initialize(URL url, ResourceBundle resourceBundle) {


        selectedProd = ProgramDriver.GetSelProd();

        if(selectedProd.equalsIgnoreCase("T shirt"))
        {
            productLbl.setText("T shirt");
            priceLbl.setText("12.99");
            descLbl.setText("Supreme T shirt");
            Image image = new Image(getClass().getResource("/images/Thumbsup.jpg").toExternalForm());
            imageBox.setImage(image);
        }

        if(selectedProd.equalsIgnoreCase("Pants"))
        {
            productLbl.setText("Pants");
            priceLbl.setText("42.00");
            descLbl.setText("Good 'ol pants");
            Image image = new Image(getClass().getResource("/images/Thumbsup.jpg").toExternalForm());
            imageBox.setImage(image);
        }

        if(selectedProd.equalsIgnoreCase("Supreme Turtleneck"))
        {
            productLbl.setText("Supreme Turtleneck");
            priceLbl.setText("69.99");
            descLbl.setText("The most supreme of turtlenecks \n there ever was");
            Image image = new Image(getClass().getResource("/images/Thumbsup.jpg").toExternalForm());
            imageBox.setImage(image);
        }




        /*
        selectedProd = ProgramDriver.GetSelProd();
        prodType = DatabaseDriver.getProdTypeFromName(selectedProd);


        if(prodType.equals("Fresh"))
        {
            Fresh product = ProgramDriver.getFreshProduct(selectedProd);
            name = product.getName();
            price = product.getPrice();
            desc = product.getDescription();
        }
        if(prodType.equals("Clothing"))
        {
            Clothing product = ProgramDriver.getClothingProduct(selectedProd);
            name = product.getName();
            price = product.getPrice();
            desc = product.getDescription();

        }
        if(prodType.equals("Games"))
        {
            Game product = ProgramDriver.getGameProduct(selectedProd);
            name = product.getName();
            price = product.getPrice();
            desc = product.getDescription();
        }



        productLbl.setText(name);
        priceLbl.setText(price.toString());
        descLbl.setText(desc);

         */





    }



    @FXML
    void addCart(ActionEvent event) {

    }


    void setSelectedProd(String s)
    {
        selectedProd = s;
    }
}
