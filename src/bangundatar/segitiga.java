/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author LENOVO
 */
public class segitiga {
    //attribute
   public double a,b,c;
    //constructor
    public segitiga(double a,double c){
        this.a=a;
        this.c=c;
    }
    //method
    /*Rumus :
   b=sqrt/c**2-a**2
    */
    public void luas() {
 double b = (double) Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
 System.out.println("Tinggi Adalah : "+ b);
 double luas=(double) 1/2 *a*b;
 System.out.println("Luas Segitiga : "+luas);
}
    public void keliling() {
        double keliling=(double) a+b+c;
        System.out.println("Keliling Segitiga : " +keliling);
    }
}   

