package bangunruang;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class tabung {
    //attribute
    double phi=Math.PI;
    double r,t;
    
    //constructor
    public tabung (double r,double t) {
        this.r=r;
        this.t=t;
    }
    //method
    //luas lingkaran 
    public void lling() {
        
        double lling=(double) phi*Math.pow(r, 2);
        System.out.println("Luas Lingkaran : " +lling + "\n");
    }
    //Keliling lingkaran
    public void kelling() {
        double kelling=(double) 2*phi*r;
        System.out.println("Keliling Lingkaran : " +kelling + "\n");
    }
    //Diameter Lingkaran
    public void diameter (){
        double diameter=(double) 2*r;
        System.out.println("Diameter Lingkaran : " +diameter + "\n");
    }
    //Volume tabung 
    public void volume() {
        double vol = (double) phi*Math.pow(r, 2)*t;
        System.out.println("Volume Tabung : " +vol +"\n");
    }
    //Luas Permukaan Tabung 
    public void lp(){
        double lp=(double) 2*phi*r*(r+t);
        System.out.println("Luas Permukaan Tabung : " +lp + "\n");
    }
}
