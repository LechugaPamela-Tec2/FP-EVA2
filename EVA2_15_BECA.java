/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_15_BECA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PROMEDIO > 80
       //INGRESOS <10000
        
        
       
       
       int prom,ingresos;
       String equipo;
       Scanner captu = new Scanner(System.in);
       System.out.println("Cuantos ingresos tienes?");
       ingresos = captu.nextInt();
       
       System.out.println("Cual es tu promedio:");
       prom = captu.nextInt();
       
        // CONDICIIONES PARA DAR BECA
        if (prom > 80 && ingresos.equals("S")){
         System.out.println("BECA ACEPTADA");
         
         }else {
         System.out.println("BECA NEGADA");
     }
    }
    
}
