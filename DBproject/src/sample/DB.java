package sample;


import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DB {
    public Connection mycon;
    public Statement mystmt;
    public PreparedStatement pmystmt;
    public ResultSet myrs;
    Scanner scn = new Scanner(System.in);


    /*

     can add the connect and the dis connect method in the other
     method that deal with data base to ensure the every method
     connect do the job then close the connection

     */
    public DB() {
        try {
            this.mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/managment", "root", "");
            System.out.println("Connection Sucess !!!");

        } catch (SQLException ex) {

            ex.getStackTrace();
        }

    }

    public void DisconnectFromDataBase() {
        try {
            this.mycon.close();
            System.out.println("Disconnection Sucsess !!!\n\n");
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }

    public void delete(int id, String TableName00) throws SQLException {

        this.pmystmt = this.mycon.prepareStatement("DELETE FROM `+TableName00+`WHERE  `ID`=(?)");
        this.pmystmt.setInt(1, id);
        this.pmystmt.executeUpdate();

    }

    public void InsertData(int id, String Nname, int Ssalary, String aaddress, String tableName) //need the system.out.print to tell the user what to do * Ignore when connected to Gui
    {
        try {
            this.pmystmt = this.mycon.prepareStatement("INSERT"
                    + " INTO `" + tableName + "`( `ID`, `Name` , `Salary` , `Adress` )"
                    + " VALUES "
                    + "(? , ? , ? , ? )");
            this.pmystmt.setInt(1, id);
            this.pmystmt.setString(2, Nname);
            this.pmystmt.setInt(3, Ssalary);
            this.pmystmt.setString(4, aaddress);
            this.pmystmt.execute();


        } catch (SQLException ex) {
            ex.getStackTrace();
            ex.getCause();
        }


    }

    public void ShowAllData(String tableName2)//need to work on the desing when display the content of the data base*  Ignore when connected to Gui
    {
        try {
            this.mystmt = mycon.createStatement();
            this.mystmt.executeQuery("SELECT * FROM" + tableName2 + " ");
            this.myrs = mystmt.getResultSet();
            while (this.myrs.next()) {
               /*
               System.out.println(this.myrs.getInt(1)+this.myrs.getString(2)

                        +this.myrs.getString(3)+this.myrs.getString(4)+
                        this.myrs.getString(5));
            */

            }
        } catch (SQLException ex) {
            ex.getStackTrace();
        }

    }

    public void UpdateData(int id, String Name_, int Salary_, String adress_, String tableName3) {
        try {
            this.pmystmt = mycon.prepareStatement("UPDATE " + tableName3 + " SET `Name` = ? , `Salary` = ? , `adress` = ? , WHERE `ID`=? ");
            this.pmystmt.setInt(4, id);
            this.pmystmt.setString(1, Name_);
            this.pmystmt.setInt(2, Salary_);
            this.pmystmt.setString(3, adress_);
            boolean sure = false;
            if (sure) {
                System.out.println("Update Done !!! \n 1 Row Efected With ID NO. " + id + " !!!");

            } else if (!sure) {
                System.out.println("Update Failed !!! \n Zero Row Efected !!! \n");

            }
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }
}

