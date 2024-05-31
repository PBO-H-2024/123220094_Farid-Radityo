/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import View.View;
import Model.Model;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Controller {
    
  Model model;
  View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        updateTable();

        view.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = view.getName();
                String path = view.getpath();
                double write = view.getwriting();
                double coding = view.getcoding();
                double interview = view.getinterview();
                double score=view.getScore();
                String status=view.getstatus();
                 model.insertData(nama, path, write, coding,interview,score,status);
                 updateTable();
                
            }
        });

        view.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = view.getName();
                String path = view.getpath();
                double writing = view.getwriting();
                double coding = view.getcoding();
                 double interview = view.getinterview();
                  double score = view.getScore();
                  String status = view.getstatus();

               
                   model.updateData(nama, path, writing, coding,interview,score,status);
                   updateTable();
               
            }
        });

        view.btnCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cariNama = view.getCariNama();
                if (cariNama.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a name to search");
                } else {
                    String[][] data = model.cariContact(cariNama);
                    if (data != null && data.length > 0) {
                        view.tabel.setModel(new javax.swing.table.DefaultTableModel(data, view.namaKolom));
                    } else {
                        JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
                    }
                }
            }
        });

        view.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTable();
            }
        });

        view.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = view.tabel.getSelectedRow();
                if (row != -1) {
                    String selectedNama = view.tabel.getValueAt(row, 0).toString();
                    String selectedPath = view.tabel.getValueAt(row, 1).toString();
                    String selectedWriting = view.tabel.getValueAt(row, 2).toString();
                    String selectedCoding = view.tabel.getValueAt(row, 3).toString();
                    String selectedInterview = view.tabel.getValueAt(row, 4).toString();
               
                    
                    view.tfNama.setText(selectedNama);
                    view.tfpath.setText(selectedPath);
                    view.tfwriting.setText(selectedWriting);
                    view.tfcoding.setText(selectedCoding);
                    view.tfinterview.setText(selectedInterview);
 
                }
            }
        });
    }

    private void updateTable() {
        String[][] dataContact = model.readContact();
        if (dataContact != null) {
            view.tabel.setModel(new javax.swing.table.DefaultTableModel(dataContact, view.namaKolom));
        } else {
            JOptionPane.showMessageDialog(null, "Data kosong");
        }
    }
}

