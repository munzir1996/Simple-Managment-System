package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller4 implements Initializable
{
    @FXML
    private TableView<Company> Table4;

    @FXML
    private TableColumn<Company, Integer> ID4;

    @FXML
    private TableColumn<Company, String> Name4;

    @FXML
    private TableColumn<Company, Integer> Salare4;

    @FXML
    private TableColumn<Company, String> Address4;

    @FXML
    private JFXButton insertFour;

    @FXML
    private JFXButton deleteFour;

    @FXML
    private JFXButton updateFour;

    @FXML
    private JFXTextField idFour;

    @FXML
    private JFXTextField nameFour;

    @FXML
    private JFXTextField salareFour;

    @FXML
    private JFXTextField addressFour;

    Integer id;
    String name;
    Integer salary;
    String address;

    ObservableList<Company> list = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        inicColums();

    }


    void inicColums()
    {
        ID4.setCellValueFactory(new PropertyValueFactory<>("id"));
        Name4.setCellValueFactory(new PropertyValueFactory<>("name"));
        Salare4.setCellValueFactory(new PropertyValueFactory<>("salary"));
        Address4.setCellValueFactory(new PropertyValueFactory<>("adress"));
    }

    void getData()
    {
        id = Integer.parseInt(idFour.getText().toString());
        name = nameFour.getText().toString();
        salary = Integer.parseInt(salareFour.getText().toString());
        address = addressFour.getText().toString();

        list.addAll(new Company(id, salary, name, address));
        Table4.getItems().setAll(list);

    }

    @FXML
    void delete(ActionEvent event) throws IOException {

        FXMLLoader menu = new FXMLLoader(getClass().getResource("update.fxml"));
        Parent root = menu.load();
        Stage stage = new Stage();
        stage.setTitle("Update");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void insert(ActionEvent event) {
        getData();
        DB Em=new DB();
        Em.InsertData(id,name,salary,address,"employe");
    }

    @FXML
    void update(ActionEvent event) throws IOException {

        FXMLLoader menu = new FXMLLoader(getClass().getResource("update.fxml"));
        Parent root = menu.load();
        Stage stage = new Stage();
        stage.setTitle("Update");
        stage.setScene(new Scene(root));
        stage.show();
    }

    }

