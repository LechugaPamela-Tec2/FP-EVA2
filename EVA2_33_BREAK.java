/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_break;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_33_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu= new Scanner(System.in);
        int valor= 10;
        int nume;
        while(true){//CICLO INFINITO
            System.out.println("INTRODUCE UN VALOR:");
            nume= captu.nextInt();
            captu.nextLine();
            
            if(nume == valor){// EL USUARIO ADIVINO Y GANO, TERMINE EL JUEGO 
                System.out.println("ADIVINASTE, EL VALOR ES 10, GANSTE||||");
                break;//TERMINA EL CICLO
            }
            
        }
    }
    
}
