/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double precio, subtot,descu = 0,total;
        int cant;
       
       Scanner captu = new Scanner(System.in);
       
       System.out.println("PRECIO DEL PRODUCTO: ");
       precio = captu.nextDouble();
       System.out.println("CANTIDAD COMPRADA: ");
       cant = captu.nextInt();
     
       
       subtot= precio * cant;
    
       
       if(subtot >=1000){
           
            descu = subtot * 0.1;
            
       }
            
            total= subtot - descu;
            System.out.println("SUBTOTAL: " + subtot);
         System.out.println("DESCUENTO DE 10%: " + descu);
          System.out.println("TOTAL: " + total);
     
        
    }
    
}
