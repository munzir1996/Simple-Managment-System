package sample;


import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controllermenu {
    //Menu //////////////////////////////////////////////////////////////////////////
    @FXML
    private ImageView menuIcon;

    @FXML
    private JFXButton oneButton;

    @FXML
    private JFXButton threeButton;

    @FXML
    private JFXButton twoButton;

    @FXML
    private JFXButton fourButton;

    @FXML
    void fourClick(ActionEvent event) throws IOException {

        //Moves you to the next window(tableFour)
        FXMLLoader menu = new FXMLLoader(getClass().getResource("tableFour.fxml"));
        Parent root = menu.load();
        Stage stage = new Stage();
        stage.setTitle("TableFour");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void oneClick(ActionEvent event) throws IOException {

        //Moves you to the next window(tableOne)
        FXMLLoader menu = new FXMLLoader(getClass().getResource("tableOne.fxml"));
        Parent root = menu.load();
        Stage stage = new Stage();
        stage.setTitle("TableOne");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void threeClick(ActionEvent event) throws IOException {

        //Moves you to the next window(tablethree)
        FXMLLoader menu = new FXMLLoader(getClass().getResource("tableThree.fxml"));
        Parent root = menu.load();
        Stage stage = new Stage();
        stage.setTitle("TableThree");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void twoClick(ActionEvent event) throws IOException {

        //Moves you to the next window(tableOne)
        FXMLLoader menu = new FXMLLoader(getClass().getResource("tableTwo.fxml"));
        Parent root = menu.load();
        Stage stage = new Stage();
        stage.setTitle("TableTwo");
        stage.setScene(new Scene(root));
        stage.show();
    }
/////////////////////////////////////////////////////////////////////////////////////////////////


}
