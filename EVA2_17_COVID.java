/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PERSONA DE RIESGO 
        //INDICAR SI UNA PERSONA PRESENTA RIESGOS EN CASO DE ENFERMARSR DE COVID.
        //SE CONSIDERA QUE ALGUIEN POSSE RIESGO SI TIENE ALGUNA DE LAS SIGUIENTES CONDICIONES
        //EDAD ES MAYOR  A 65
        //TIEN EALGUNA ENFERMEDAD CRÓNICA
        //POSEE UN INDICE DE MASA CORPORAL (IMC*) MAYOR O IGULA A 25
        
        int edad;
        boolean cronica,riesgo;
        double peso,estatura,imc;
       Scanner captu = new Scanner(System.in);
       
       System.out.println("¿CUAL ES TU EDAD?");
       edad = captu.nextInt();
       
       System.out.println("¿TIENE ENFERMADEAD CRONICA,SI O NO?");
       cronica = captu.hasNextBoolean();
       
       System.out.println("¿CUANTO PESAS?");
       peso = captu.nextDouble();
       
       System.out.println("¿CUAL ES TU ESTATURA?");
       estatura = captu.nextDouble();
       
       imc = peso /(estatura * estatura);
       
       System.out.println("IMC" +imc);
       if ((edad > 65) || (cronica == true)|| (imc >=25)){
           System.out.println("IMC" + imc);
           System.out.println("CON RIESGO DE COVID");
       }else{
           System.out.println("SIN RIESGO DE COVID");
       }
               
       
       
       
       
    }
    
}
