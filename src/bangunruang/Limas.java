/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 * @author RAWROOOARRREARRROARRREEEOARRRRRRRAEEEEEEOOORRRRRRRRR
 */
public class Limas extends bangundatar.segitiga{
 
    //attribute
    double tilimas;
   
  
  
    

    
    
    //constructor
 
    public Limas(double a,double c,double tilimas) {
      super(a,c);
      this.tilimas=tilimas;
      
        
    }
    public void volume () {
        double b = (double) Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
        double r=(double) 1/2 * a * b;
        double vol=(double) 1/2*r*tilimas;
        System.out.println("Volume Limas Segitiga : " + vol + "\n");
    }
    public void kelalas() {
   
        double kel = (double) a+b+c;
        System.out.println("Keliling Alas Limas : "+kel+"\n");
    }
    public void lp(){
        double kel = (double) a+b+c;
        double lsisi=(double) 1/2*a*b;
        double lsisilimas=(double) 1/2*c*kel;
        double lp=(double) lsisi+lsisilimas;
        System.out.println("Luas Permukaan Limas : "+lp+"\n");
    }
  
}
