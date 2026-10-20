/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_18_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captu = new Scanner(System.in);
       
       System.out.println("INTRODUCE EL NUMERO DEL DIA (1 - 7)");
       int dia = captu.nextInt();
       
       switch(dia){//EVALUA ENTEROS: INT, SHORT,BYE, TEXTO:String ENUM:
           case 1:
         
       System.out.println("DOMINGO");
       //AQUI PODEMOS PONER CUANTAS INSTRUCCIONES NECESITAMOS 
       break;//TERMINA DONDE VA TERMINAR EL SWITCH
       
           case 2:
        System.out.println("LUNES");
       //AQUI PODEMOS PONER CUANTAS INSTRUCCIONES NECESITAMOS 
       break;
        case 3:
        System.out.println("MARTES");
       //AQUI PODEMOS PONER CUANTAS INSTRUCCIONES NECESITAMOS 
       break;
        case 4:
        System.out.println("MIERCOLES");
       //AQUI PODEMOS PONER CUANTAS INSTRUCCIONES NECESITAMOS 
       break;
        case 5:
        System.out.println("JUEVES");
       //AQUI PODEMOS PONER CUANTAS INSTRUCCIONES NECESITAMOS 
       break;
        case 6:
        System.out.println("VIERNES");
       //AQUI PODEMOS PONER CUANTAS INSTRUCCIONES NECESITAMOS 
       break;
        case 7:
        System.out.println("SABADO");
       //AQUI PODEMOS PONER CUANTAS INSTRUCCIONES NECESITAMOS 
       break;
        default: //OPCIONAL : QUE HAGO VUADP NO SE NIMGINA OPCION ANTERIOR 
            System.out.println("DIA NO VALIDO");
               
      
       
       }
       
    }
    
}
