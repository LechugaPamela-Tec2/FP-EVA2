/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_31_DO_WHILE_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PIDE AL USUARIO ADIVINAR UN NUMERO
        //TERMINA CUANDO ADIVINA EL NUMERO
        
        
        int num;
        Scanner captu= new Scanner(System.in);
        
        do{
            System.out.println("NUMERO:");
            num = captu.nextInt();
            System.out.println("NO SE PUEDE:");
            
            
        }while(num !=5);
        System.out.println("ACCESO CIONCEDIDO");
    }
    
}
