/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BECA
        // PROMEDIO >= 95
        // ESTA EN EQUIPO REPRESENTATIVO
        
       
       int prom;
       String equipo;
       Scanner captu = new Scanner(System.in);
       System.out.println("Perteneces a equipos representativos si o no?:");
       equipo = captu.nextLine();
       
       System.out.println("Cual es tu promedio:");
       prom = captu.nextInt();
       
     // CONDICIIONES PARA DAR BECA
     if (prom >= 95 || equipo.equals("S")){
         System.out.println("BECA ACEPTADA");
     }else {
         System.out.println("BECA NEGADA");
     }
       
    }
    
}
