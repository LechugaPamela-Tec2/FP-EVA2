/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_16_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DESCUENTO EN AUTOBÚS
        //INDICAR SI UNA PERSONA TIENE DESCUENTO EN EL AUTOBÚS. SE DEBE CUMPLIR 
        //ALGUNOS DE LOS SIGUIENTES CRETERIOS
        //ES MENOR DE EDAD
        //ES ESTUDIANTE (DEBE POSEER CREDENCIAL VIGENTE)
        //TIENE MAS DE 60 AÑOS, CON CREDENCIAL DEL INSEN
        int edad;
        boolean credevigente, credeINSEN, estudiante;
        String  adulto;
        
       Scanner captu = new Scanner(System.in);
       System.out.println("¿ CUAL ES TU EDAD?");
       edad = captu.nextInt();
       captu.nextLine();
       
       System.out.println("¿ ERES ESTUDIANTE?");
       estudiante = captu.nextBoolean();
       captu.nextLine();
       
       System.out.println("TIENE CREDENCIAL VIGENTE?");
       credevigente = captu.nextBoolean();
       
        System.out.println("¿TIENE CREDENCIAL INSEN?");
        credeINSEN = captu.nextBoolean();
       
       if ((edad.equals("Si")) || (estudiante.equals("si") && credevigente) || (adulto.equals("SI") && credeINSEN)){
        System.out.println("SI TIENES DESCUENTO!!!!!");
       }else{
           System.out.println("NO TIENES DESCUNETO!!!!");
       }
           
       }
    
}
