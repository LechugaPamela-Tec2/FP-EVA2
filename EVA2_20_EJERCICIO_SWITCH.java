/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULADORA
        //PEDIR DOS VALORES ENTEROS
        //PEDIR LA OPERACION: USAR SWITCH
        //1 SUMA
        //2 RESTAS
        //3 MULTIPLICACION
        //4 DIVISION
        // CUALQUIER OTRO VALOR---> OPERACION INVALIDA
        //MOSTRAR EL RESULTADO
        
        Scanner captu = new Scanner(System.in);
       int operacion;
       double val1,val2,resultado;
       System.out.println("COLOCA EL PRIMER VALOR:");
       val1 = captu.nextDouble();
       System.out.println("COLOCA EL SEGUNDO VALOR:");
       val2 = captu.nextDouble();
       System.out.println("COLOCA EL SEGUNDO VALOR:");
      
        System.out.println("1 SUMA:");
        System.out.println("2 RESTA:");
        System.out.println("3 MULTIPLICACION:");
        System.out.println("4 DIVISION:");
        operacion = captu.nextInt();
      
       
       
        
       switch(operacion){
           case  1 :
               resultado= val1 + val2;
                System.out.println("SUMA" + resultado);
                break;
          case  2 :
               resultado= val1 - val2;
                System.out.println("RESTA" + resultado);
                break;
           case 3 :
               
               resultado= val1 * val2;
                System.out.println("MULTIPLICACION" + resultado);
                break;
          case  4 :
               resultado= val1 / val2;
                System.out.println("DIVISION" + resultado);
                break;
          
          default:  
            System.out.println("DIA NO VALIDO");
       
       }
        
        
        
    }
    
}
