package sample;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controllerupdate implements Initializable{

    @FXML
    private JFXTextField ID;

    @FXML
    private JFXTextField Name;

    @FXML
    private JFXTextField Address;

    @FXML
    private JFXTextField Salary;

    @FXML
    private JFXButton Update;

    int id;

    @FXML
    void deleteClick(ActionEvent event) throws SQLException {

        getId();
        DB n=new DB();
        n.delete(id,"acounters");

    }

    @FXML
    void updateClick(ActionEvent event) {

        getId();
DB u=new DB();
        Scanner scn=new Scanner(System.in);

        String a;
        a = "ali";

        String b="azhari";
        int s=342;
        u.UpdateData(id,a,s,b,"employe");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    void getId()
    {
        id = Integer.parseInt(ID.getText().toString());
    }

}
