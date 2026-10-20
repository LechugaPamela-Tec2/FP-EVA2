/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       int promedio;
       
       Scanner captu = new Scanner(System.in);
        System.out.println("SOLICITAR PROMEDIO: ");
        promedio = captu.nextInt();
        
        
         if(promedio < 0){
         
            System.out.println("DATO INAVALIDO");
        }else if(promedio <=70){
            
            System.out.println("INSIFICIENTE " );
        }else if(promedio <=80){
            
            System.out.println("ACEPTABLE ");
        }else if(promedio <=90){
            
            System.out.println("BUENO ");
        }else if(promedio >100){
            
            System.out.println("NO INVALIDO ");        
        
    }
    }
}
