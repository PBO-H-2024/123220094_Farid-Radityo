package mvcapp;

import java.sql.*;
import javax.swing.JOptionPane;

public class Connector {
    String DBurl = "jdbc:mysql://localhost:3306/student_db7?useLegacyDateTimeCode=false&serverTimezone=UTC";
    String DBusername = "root";
    String DBpassword = "";
    String data[][] = new String[500][4];
    Connection conn;
    Statement statement;

    public Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DBurl, DBusername, DBpassword);
        } catch (Exception ex) {
            System.out.println("Connection Failed " + ex.getMessage());
        }
    }

    void insertData(String nama, String noHp, String umur, String email) {
        try {
            String query = "INSERT INTO `schedule` (`lecture_number`, `lecture_name`, `lecturer_number`, `class`) " +
                           "VALUES ('" + nama + "', '" + noHp + "', '" + umur + "', '" + email + "')";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Input Success");
            JOptionPane.showMessageDialog(null, "Input success");
        } catch (Exception ex) {
            System.out.println("Input Failed: " + ex.getMessage());
        }
    }

    String[][] readData() {
        try {
            int totalData = 0;
            String query = "SELECT * FROM `schedule`";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[totalData][0] = resultSet.getString("lecture_number");
                data[totalData][1] = resultSet.getString("lecture_name");
                data[totalData][2] = resultSet.getString("lecturer_number");
                data[totalData][3] = resultSet.getString("class");
                totalData++;
            }
        } catch (Exception ex) {
            System.out.println("Read Failed: " + ex.getMessage());
        }
        return data;
    }

    void updateData(String nama, String noHp, String umur, String email) {
        try {
            String query = "UPDATE `schedule` SET `lecture_name` = '" + noHp + "', `lecturer_number` = '" + umur + "', `class` = '" + email + "' " +
                           "WHERE `lecture_number` = '" + nama + "'";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Update Success");
            JOptionPane.showMessageDialog(null, "Update Success");
        } catch (Exception ex) {
            System.out.println("Update Failed: " + ex.getMessage());
        }
    }

    public void deleteData(String nama) {
        try {
            String query = "DELETE FROM `schedule` WHERE lecture_number='" + nama + "'";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Delete Success");
            JOptionPane.showMessageDialog(null, "Delete success");
        } catch (Exception ex) {
            System.out.println("Delete Failed: " + ex.getMessage());
        }
    }
}
