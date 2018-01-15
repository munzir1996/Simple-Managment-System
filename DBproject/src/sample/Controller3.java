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


public class Controller3 implements Initializable {

    @FXML
    private TableView<Company> Table3;

    @FXML
    private TableColumn<Company, Integer> ID3;

    @FXML
    private TableColumn<Company, String> Name3;

    @FXML
    private TableColumn<Company, Integer> Salare3;

    @FXML
    private TableColumn<Company, String> Address3;

    @FXML
    private JFXButton insertThree;

    @FXML
    private JFXButton deleteThree;

    @FXML
    private JFXButton updateThree;

    @FXML
    private JFXTextField idThree;

    @FXML
    private JFXTextField nameThree;

    @FXML
    private JFXTextField salareThree;

    @FXML
    private JFXTextField addressThree;

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
        ID3.setCellValueFactory(new PropertyValueFactory<>("id"));
        Name3.setCellValueFactory(new PropertyValueFactory<>("name"));
        Salare3.setCellValueFactory(new PropertyValueFactory<>("salary"));
        Address3.setCellValueFactory(new PropertyValueFactory<>("adress"));
    }

    void getData()
    {
        id = Integer.parseInt(idThree.getText().toString());
        name = nameThree.getText().toString();
        salary = Integer.parseInt(salareThree.getText().toString());
        address = addressThree.getText().toString();

        list.addAll(new Company(id, salary, name, address));
        Table3.getItems().setAll(list);
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
        DB HR=new DB();
        HR.InsertData(id,name,salary,address,"h.r");
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
