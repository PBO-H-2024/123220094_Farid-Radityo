/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author LENOVO
 */
public class Inputdata extends JFrame{
    Connector connector=new Connector();
    JFrame window =new JFrame("Student Input");
    JLabel lnim=new JLabel("NIM : ");
    JTextField fnim=new JTextField();
    JLabel lname=new JLabel("Name : ");
    JTextField fname=new JTextField();
    JLabel lage=new JLabel("Age : ");
    JTextField fage=new JTextField();
    JButton btnAdd=new JButton("ADD");
    public Inputdata(){
        window.setLayout(null);
        window.setSize(500,200);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.add(lnim);
        window.add(fnim);
        window.add(lname);
        window.add(fname);
        window.add(lage);
        window.add(fage);
        window.add(btnAdd);
        lnim.setBounds(5,35,120,20);
        lname.setBounds(5,60,120,20);
        lage.setBounds(5,85,120,20);
        fnim.setBounds(150,35,120,20);
        fname.setBounds(150,60,120,20);
        fage.setBounds(150,85,120,20);
        btnAdd.setBounds(300,35,90,20);
        
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connector.insertData(Integer.parseInt(fnim.getText()), fname.getText(), Integer.parseInt(fage.getText()));
                 }
        });
        
    }
    
}
