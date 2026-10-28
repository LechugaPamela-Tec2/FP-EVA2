/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_4;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_25_EJERCICIOS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SOLICITAR DOS NUMEROS : BASE Y EXPONENTE : CCALCULAR LA POTENCIA 
        //EJEMPLO: 3 Y 2
        //RESULTADO: 3 ELEVADO A LA 2 = 9 
        
        
        int base, expo,resu=1;
        
        Scanner captu = new Scanner(System.in);
         
         System.out.println("BASE: ");
        base = captu.nextInt();
        
        System.out.println("EXPONENTE: ");
        expo = captu.nextInt();
        
        for(int i = 1; i <=expo; i++){
            
            resu= resu * base;
            
        }
        System.out.println(base + "ELEVADO A LA" + expo + "=" + resu);
    }
    
}
