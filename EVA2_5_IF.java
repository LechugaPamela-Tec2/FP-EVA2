/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad, credencial;
        Scanner captu = new Scanner(System.in);
        
        
       System.out.println("CUÁL ES TU EDAD: ");
       edad = captu.nextInt();
       
       if(edad >= 18) {
          System.out.println("TIENES CREDECIAL DE ELECTOR? (1 = SI 0 = NO): ");
          credencial = captu.nextInt();
          if(credencial == 1){//tienes credencial
              System.out.println("PUEDES PASAR ");
  
          }else{
           System.out.println("NO PUEDES ENTRAR!!!!!!! ");
       }
         }else{
          System.out.println("Ckick to ");
          }
    }
    
}
