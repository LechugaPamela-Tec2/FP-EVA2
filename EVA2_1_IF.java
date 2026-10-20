/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("¿CUAL ES TU EDAD?");
        edad = captu.nextInt();
        
        //PARENTESIS OBLIGATORIA, DENTTRO LA EXPRESION CONDICIONAL DE VERDADERO O FALSO 
        if(edad >= 18)//QUE HACEMOS SI ES VERDADERO
            System.out.println("Bienvenido, puedes entrar");
        else //QUE HACEMOS SI SEE FALSO (OPCIONAL);
            System.out.println("NO PUEDES ENTRAR (LE DA SU ESTATEQUIETO)");
     }
    
}
