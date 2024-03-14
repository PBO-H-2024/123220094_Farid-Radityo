/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungbangun;
import java.util.Scanner;
import bangunruang.Limas;
import bangunruang.tabung;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner myobj=new Scanner(System.in);
       boolean back=true;
       while(back==true) {
       back=false;
       System.out.println("===================\n");
       System.out.println("\tMenu\n");
       System.out.println("===================\n");
       System.out.println("  1.Tabung\n");
       System.out.println("  2.Limas Segitiga\n");
       System.out.println("  Choose Menu : ");
       
       int choose=myobj.nextInt();
       switch (choose) {
           case 1 :
               System.out.println ("Masukkan Jari-jari : " );
               double r=myobj.nextDouble();
               System.out.println ("Masukkan Tinggi : " );
               double t=myobj.nextDouble();
               tabung tbung=new tabung(r,t);
               tbung.kelling();
               tbung.diameter();
               tbung.lling();
               tbung.volume();
               tbung.lp();
            
             
               break;
           case 2 :
              
              
               
               System.out.println("Input Panjang alas segitiga (a) : ");
               double a=myobj.nextDouble();
               System.out.println("Input Panjang sisi miring(c) :");
                double c=myobj.nextDouble();
               System.out.println("Input Panjang Tinggi Limas :");
               
               double tilimas=myobj.nextDouble();
              bangundatar.segitiga segi3=new bangundatar.segitiga(a,c);
              segi3.luas();
              segi3.keliling();
              bangunruang.Limas limas=new bangunruang.Limas(a, c, tilimas);
              limas.kelalas();
              limas.lp();
              limas.volume();
            
              
               
               break;
           default :
               back=true;
               break;
               
       }
       }
            
    }
  
    
}
