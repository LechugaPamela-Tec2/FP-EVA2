/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_2_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
         Scanner captu = new Scanner(System.in);
        System.out.println("¿CUAL FUE TU CALIFICACIÓN?");
        cali = captu.nextInt();
        
        
        if(cali >= 70)//QUE HACEMOS SI ES VERDADERO
            System.out.println("FELICIDADES HAS PASADO");
        else //QUE HACEMOS SI SEE FALSO (OPCIONAL);
            System.out.println("NO HAS PASADO, ANIMO!!!!");
    }
    
}
