/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author PC PRAKTIKUM
 */
public class View extends JFrame {

    JLabel lNama = new JLabel("Name");
    JLabel lpath = new JLabel("Path");
    JLabel lwriting = new JLabel("Writing");
    JLabel lcoding = new JLabel("Coding");
    JLabel linter = new JLabel("Interview");
    JLabel Score = new JLabel("Score");
    JLabel lCari = new JLabel("Cari Nama");

    JTextField tfNama = new JTextField();
    JTextField tfpath = new JTextField();
    JTextField tfwriting = new JTextField();
    JTextField tfcoding = new JTextField();
    JTextField tfinterview = new JTextField();
    JTextField tfCari = new JTextField();

    JButton btnTambah = new JButton("Tambah");
    JButton btnUpdate = new JButton("Update");
    JButton btnCari = new JButton("Cari");
    JButton btnReset = new JButton("Refresh");

    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Name", "Path", "Writing", "Coding","Interview","Score","Status"};

    public View() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);

        setTitle("Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900, 400);

        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);

        add(lNama);
        lNama.setBounds(510, 20, 90, 20);
        add(tfNama);
        tfNama.setBounds(510, 40, 120, 20);

        add(tfpath);
        lpath.setBounds(510, 70, 90, 20);
        add(tfwriting);
        tfwriting.setBounds(510, 90, 120, 20);

        add(lcoding);
        lcoding.setBounds(510, 120, 90, 20);
        add(lcoding);
        tfcoding.setBounds(510, 140, 120, 20);

        add(linter);
        linter.setBounds(510, 170, 90, 20);
        add(tfinterview);
        tfinterview.setBounds(510, 190, 120, 20);

        add(btnTambah);
        btnTambah.setBounds(510, 220, 90, 20);
        add(btnUpdate);
        btnUpdate.setBounds(510, 250, 90, 20);

        add(btnCari);
        btnCari.setBounds(510, 280, 90, 20);
        add(btnReset);
        btnReset.setBounds(510, 310, 90, 20);
    }
    
    double write  = Double.parseDouble(tfwriting.getText());
    double coding  = Double.parseDouble(tfcoding.getText());
    double interview  = Double.parseDouble(tfinterview.getText());
    String status;
    double score;
    public String getNama() {  
        return tfNama.getText();
    }

    public String getpath() {
        return tfpath.getText();
        
    }

    public double getwriting() {
     double write  = Double.parseDouble(tfwriting.getText());
     return write;
    }

    public double getcoding() {
         double coding  = Double.parseDouble(tfcoding.getText());
         return coding;
    }

    public double getinterview() {
        double interview  = Double.parseDouble(tfinterview.getText());
        return interview;
    }
     public double getScore() {
         double writeval,codingval,interviewval,score = 0;
         if (tfpath.getText()=="Android Developer"){
              writeval=write*0.2;
              codingval=coding*0.5;
              interviewval=interview*0.3;
              score=(writeval*codingval*interviewval)/3;
               
         }
         else if (tfpath.getText()=="Web Developer"){
              writeval=write*0.4;
              codingval=coding*0.35;
              interviewval=interview*0.25; 
               score=(writeval*codingval*interviewval)/3;
      
         }

         return score;
         
        
    } 
     public String getstatus() {
      
        double interview  = Double.parseDouble(tfinterview.getText());
        double score = getScore();
        if (score>=85){
            status="ACCEPTED";
        }
        else {
            status="NOT ACCEPTED";
        }
        return status;
    }
    
    public String getCariNama() {
        return tfCari.getText();
    }
}