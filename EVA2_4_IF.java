/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_if;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_4_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario, bono, salariofinal;
        String nom;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("NOMBRE DEL EMPLEADO:");
        nom = captu.nextLine();
        System.out.println("SALARIO MENSUAL:");
        salario = captu.nextDouble();
        
        if(salario < 12000){
            bono= salario * 0.10;
            
        }else{
        
        bono= salario * 0.05;
         }
        
        salariofinal = salario + bono;
        
        
        System.out.println("RESULTADO FINAL");
        System.out.println("NOMBRE:"+ nom);
        System.out.println("SALARIO:" + salario);
        System.out.println("BONO:" + bono);
        System.out.println("SALAIO FINAL:" + salariofinal);
        
        
    }  
   }
