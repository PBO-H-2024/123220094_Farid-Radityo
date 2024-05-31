/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author PC PRAKTIKUM
 */
public class Model {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/student?useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";
    Connection koneksi;
    Statement statement;

    public Model() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = koneksi.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection failed: " + e.getMessage());
        }
    }

    public String[][] readContact() {
        try {
            int jmlData = 0;
            String data[][] = new String[10][4];
            String query = "SELECT * FROM data";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[jmlData][0] = resultSet.getString("Name");
                data[jmlData][1] = resultSet.getString("Path");
                data[jmlData][2] = resultSet.getString("Writing");
                data[jmlData][3] = resultSet.getString("Coding");
                data[jmlData][4] = resultSet.getString("Interview");
                data[jmlData][5] = resultSet.getString("Score");
                data[jmlData][6] = resultSet.getString("Status");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public String[][] cariContact(String nama) {
        try {
            int jmlData = 0;
            String query = "SELECT * FROM data WHERE Nama LIKE '%" + nama + "%'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }

            String data[][] = new String[jmlData][4];

            if (jmlData == 0) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            } else {
                jmlData = 0;
                query = "SELECT * FROM data WHERE Name LIKE '%" + nama + "%'";
                resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                data[jmlData][0] = resultSet.getString("Name");
                data[jmlData][1] = resultSet.getString("Path");
                data[jmlData][2] = resultSet.getString("Writing");
                data[jmlData][3] = resultSet.getString("Coding");
                data[jmlData][4] = resultSet.getString("Interview");
                data[jmlData][5] = resultSet.getString("Score");
                data[jmlData][6] = resultSet.getString("Status");
                    jmlData++;
                }
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public void insertData(String Nama, String Path, Double Writing, Double Coding,Double Interview,Double score,String status) {
        int jmlData = 0;
        try {
            String query = "SELECT * FROM data WHERE Name='" + Nama + "'";
            System.out.println(Nama + " " + Path + " " + Writing + " " + Coding + " " + Interview + " "+score+ " "+status);
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                jmlData++;
            }

            if (jmlData == 0) {
                query = "INSERT INTO data VALUES('" + Nama + "','" + Path + "','" + Writing + "','" + Coding + "','" + Interview + "','" + score + "')";
                statement.executeUpdate(query);
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            } else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    }

    public void deleteData(String Nama) {
        try {
            String query = "DELETE FROM data WHERE Name='" + Nama + "'";
            statement.executeUpdate(query);
            System.out.println("Delete Success");
        } catch (SQLException e) {
            System.out.println("Delete Failed: " + e.getMessage());
        }
    }

    public void updateData(String Name, String path, Double writing, Double coding,Double Interview,Double score,String status) {
        try {
            String query = "UPDATE contact SET Path = '" + path  + "', Writing = '" + writing + "', Coding = '" + coding + "',Interview='" + Interview +"',Score='" + score + "',status='" +status+ "'  WHERE Name = '" + Name + "'";
            statement.executeUpdate(query);
            System.out.println("Data berhasil diperbarui");
            JOptionPane.showMessageDialog(null, "Data berhasil diperbarui");
        } catch (SQLException e) {
            System.out.println("Update Data Gagal: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Update Data Gagal: " + e.getMessage());
        }
    }
}
