package Control;

import Model.Clothing;
import Model.DatabaseDriver;
import Model.Electronic;
import Model.Fresh;
import Model.Game;
import Model.LinkedList;
import Model.Product;

public class ProgramDriver {

    static String selProduct;

    public static LinkedList<Product> getFreshList(){
        return DatabaseDriver.BuildLL(1,  "Fresh");
    }

    public LinkedList<Product> getGameList(){
        return DatabaseDriver.BuildLL(1, "Game");
    }

    public static LinkedList<Product> getClothesList(){
        return DatabaseDriver.BuildLL(1,  "Clothing");
    }

    public LinkedList<Product> getElectronicsList(){
        return DatabaseDriver.BuildLL(1,  "Electronics");
    }

    public static Fresh getFreshProduct(String prodName) {
        Fresh temp = null;

        temp = (Fresh) DatabaseDriver.getProd(prodName);

        return temp;
    }

    public Electronic getElectronicProduct(String prodName) {
        Electronic temp = null;

        temp = (Electronic) DatabaseDriver.getProd(prodName);

        return temp;
    }

    public static Clothing getClothingProduct(String prodName) {
        Clothing temp = null;

        temp = (Clothing) DatabaseDriver.getProd(prodName);

        return temp;
    }

    public static Game getGameProduct(String prodName) {
        Game temp = null;

        temp = (Game) DatabaseDriver.getProd(prodName);

        return temp;
    }



    public static void SetSelProd(String s) {
        selProduct = s;
    }

    public static String GetSelProd() {
        return selProduct;
    }
}
