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

public class Controller2 implements Initializable
{

    @FXML
    private TableView<Company> Table2;

    @FXML
    private TableColumn<Company, Integer> ID2;

    @FXML
    private TableColumn<Company, String> Name2;

    @FXML
    private TableColumn<Company, Integer> Salare2;

    @FXML
    private TableColumn<Company, String> Address2;

    @FXML
    private JFXButton insertTwo;

    @FXML
    private JFXButton deleteTwo;

    @FXML
    private JFXButton updateTwo;

    @FXML
    private JFXTextField idTwo;

    @FXML
    private JFXTextField nameTwo;

    @FXML
    private JFXTextField salareTwo;

    @FXML
    private JFXTextField addressTwo;

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
        ID2.setCellValueFactory(new PropertyValueFactory<>("id"));
        Name2.setCellValueFactory(new PropertyValueFactory<>("name"));
        Salare2.setCellValueFactory(new PropertyValueFactory<>("salary"));
        Address2.setCellValueFactory(new PropertyValueFactory<>("adress"));
    }

    void getData()
    {
        id = Integer.parseInt(idTwo.getText().toString());
        name = nameTwo.getText().toString();
        salary = Integer.parseInt(salareTwo.getText().toString());
        address = addressTwo.getText().toString();

        list.addAll(new Company(id, salary, name, address));
        Table2.getItems().setAll(list);

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
DB a=new DB();
        a.InsertData(id,name,salary,address,"acounters");
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
