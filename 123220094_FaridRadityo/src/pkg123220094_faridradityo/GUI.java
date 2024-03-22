/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123220094_faridradityo;
import javax.swing.*;
/**
 *
 * @author PC PRAKTIKUM
 */
public class GUI extends JFrame{
   //Attribute
    JLabel name=new JLabel("Name : ");
    JTextField fname=new JTextField();
    JLabel nim=new JLabel("NIM : ");
    JTextField Nim=new JTextField();
    JLabel type=new JLabel("Type : ");
    JRadioButton rAD=new JRadioButton("Android Developer");
    JRadioButton rWD=new JRadioButton("Web Developer");
    JLabel test=new JLabel("Writing Exam ");
    JTextField we=new JTextField();
    JLabel test1=new JLabel("Coding Test");
    JTextField ct=new JTextField();
    JLabel test2=new JLabel("Interview Test");
    JTextField it=new JTextField();
    public JButton submit=new JButton ("Submit");
    //Constructor
    public GUI () {
        setTitle("Test Result");
        setSize(500,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        ButtonGroup group=new ButtonGroup();
        group.add(rAD);
        group.add(rWD);
        add(name);
        add(fname);
        add(Nim);
        add(nim);
        add(type);
        add(submit);
        
    
        name.setBounds(10,20,100,20);
        name.setBounds(10,20,100,20);
        fname.setBounds(130,20,100,20);
        nim.setBounds(10,40,100,20);
        Nim.setBounds(130,40,100,20); 
        type.setBounds(10,60,100,20);
        rAD.setBounds(10,90,105,20); 
        rWD.setBounds(10,130,105,20);
        test.setBounds(10,160,100,20);
        we.setBounds(160,180,100,20);
        test1.setBounds(10,160,100,20);
        ct.setBounds(10,190,100,20);
        submit.setBounds(130,220,100,20);
    }
    
    //method
    public void setLname(JTextField lname) {
        this.fname=lname;    
    }
    public void setNIM(JTextField NIM) {
        this.Nim=NIM;    
    }
    public void setrAD (JRadioButton rAD) {
        this.rAD=rAD;
    }
    public void setrWD (JRadioButton rWD) {
        this.rWD=rWD;
    }
    public void setCT(JTextField ct){
        this.ct=ct;
    }
    public void setwe(JTextField we){
        this.we=we;
    }
    
    
    
    
            
           
    
}
