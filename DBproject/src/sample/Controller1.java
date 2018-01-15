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


public class Controller1 implements Initializable {

    @FXML
    private TableView<Company> Table1;

    @FXML
    private TableColumn<Company, Integer> ID1;

    @FXML
    private TableColumn<Company, String> Name1;

    @FXML
    private TableColumn<Company, Integer> Salare1;

    @FXML
    private TableColumn<Company, String> Address1;

    @FXML
    private JFXButton insertOne;

    @FXML
    private JFXButton deleteOne;

    @FXML
    private JFXButton updateOne;

    @FXML
    private JFXTextField idOne;

    @FXML
    private JFXTextField nameOne;

    @FXML
    private JFXTextField salareOne;

    @FXML
    private JFXTextField addressOne;

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
        ID1.setCellValueFactory(new PropertyValueFactory<>("id"));
        Name1.setCellValueFactory(new PropertyValueFactory<>("name"));
        Salare1.setCellValueFactory(new PropertyValueFactory<>("salary"));
        Address1.setCellValueFactory(new PropertyValueFactory<>("adress"));
    }

    void getData()
    {
        id = Integer.parseInt(idOne.getText().toString());
        name = nameOne.getText().toString();
        salary = Integer.parseInt(salareOne.getText().toString());
        address = addressOne.getText().toString();

        list.addAll(new Company(id, salary, name, address));

        Table1.getItems().setAll(list);

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
        DB n=new DB ();
        n.InsertData(id,name,salary,address,"security");



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
