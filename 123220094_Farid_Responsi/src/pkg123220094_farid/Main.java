/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123220094_farid;

import Model.Model;
import View.View;
import View.Controller;
/**
 *
 * @author PC PRAKTIKUM
 */
public class Main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Model model=new Model();
    View view=new View();
    Controller controller=new Controller(model,view);
    System.out.println(controller);
    }
    
}
