/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_2;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_25_EJERCICIOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //SOLICITAR UN NUMERO E IMPRIMIR EL SIGUIENTE PATRON CON TEXTO:
      //EJEMPLO: 5
      //RESULTADO: * ** *** **** *****
      
      int nume1;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("COLOCA TU NUMERO PARA COLOCAR UN PATRON: ");
        nume1 = captu.nextInt();
        String cade = "";
        
        
        captu.nextLine();
        
        for(int i = 1; i <= nume1; i ++){
            cade= cade + "*";
           
           System.out.println(cade );
        }
             
        }
       
    }
    

