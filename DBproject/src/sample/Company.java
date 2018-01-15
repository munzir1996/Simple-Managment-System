package sample;

import javafx.fxml.Initializable;

/**
 * Created by toshiba on 25/02/17.
 */
public class Company {

    private Integer id;
    private Integer salary;
    private String adress;
    private String name;

    public Company(Integer id, Integer salary, String name, String adress) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
