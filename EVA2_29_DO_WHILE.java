/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_do_while;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_29_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu= new Scanner(System.in);
        int monto, cuenta=5000;
        
        do{//EJECUCION DEL SISTEMA
            System.out.println("CUANTO QUERES RETIRAR?");
            monto = captu.nextInt();
            //ACUMULADOR
            cuenta= cuenta - monto;
            System.out.println("TU SALDO ES = " + cuenta);
        }while(cuenta > 0);
        System.out.println("SE TE ACABO EL DINERO");
        
    }
    
}
