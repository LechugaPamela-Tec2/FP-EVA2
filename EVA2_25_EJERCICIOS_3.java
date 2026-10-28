/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_3;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_25_EJERCICIOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SOLICITAR UN NUMERO E IMPRIMIR SU TABLA DE MULTIPLICAR
        //EJOMPLO: 3
        //3 X 1= 3
        //3 X 2= 6
        //3 X 10 = 30
        
         int num;
         
         Scanner captu = new Scanner(System.in);
         
         System.out.println("COLOCA UN NUMERO: ");
        num = captu.nextInt();
        
        
        
        captu.nextLine();
        
        for(int i = 1; i <= 10; i++){
           
           System.out.println(num + "x" + i + "=" + (num + i));
        }
    }
    
}
