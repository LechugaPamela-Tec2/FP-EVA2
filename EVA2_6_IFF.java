/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_if;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_6_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("NÚMERO DEL DIA DE LA SEMANA:  1- 7");
        dia = captu.nextInt();
        
     if(dia == 1){
        System.out.println("DOMINGO");
        
    }else if(dia == 2){
        System.out.println("LUNES");
    }else if(dia == 3){
        System.out.println("MARTES");
    }else if(dia == 4){
        System.out.println("MIERCOLES");
    }else if(dia == 5){
        System.out.println("JUEVES");
    }else if(dia == 6){
        System.out.println("VIERNES");
    }else if(dia == 7){
        System.out.println("SABDO");
    }else{
        System.out.println("OPCION NO VALIDA");
            
            
    }
    
}
