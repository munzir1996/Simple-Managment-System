package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{



//Login Controller///////////////////////////////////////////////////////////////////////////////
        @FXML
        private AnchorPane Login;

        @FXML
        private JFXTextField userName;

        @FXML
        private JFXTextField Passward;

        @FXML
        private JFXButton loginButton;

        @FXML
        private ImageView userIcon;

        @FXML
        private ImageView passIcon;

        @FXML
        void loginClick(ActionEvent event) throws IOException {
System.out.println("Working^_^");

            String username = "m";
            System.out.println(username);

            String passward = "1";
            System.out.println(passward);

            //It is not Working
            if(userName.getText().toString().equals(username) && Passward.getText().toString().equals(passward))
            {
                System.out.println("Login");

                //Moves you to the next window(Menu)
                FXMLLoader menu = new FXMLLoader(getClass().getResource("menu.fxml"));
                Parent root = menu.load();
                Stage stage = new Stage();
                stage.setTitle("Menu");
                stage.setScene(new Scene(root));
                stage.show();
            }
            else
                System.out.println("error");



        }
//////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
