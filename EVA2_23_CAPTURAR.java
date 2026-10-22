/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_23_CAPTURAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SOLICITAR LAS CALIFICACIONES Y PROMEDIAR 
        int cant, califa= 0;
        double promedio;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("CUANTAS CALFICACIONES VAS A CAPTURAR?");
        cant = captu.nextInt();
        captu.nextLine();
        
        
        for(int i = 0; i < cant; i++){//for(int i = 14; i < cant; i++)
            System.out.println("CAPTURA LA CALIFA:");
            califa = califa + captu.nextInt();//ACUMULADOR
            
            captu.nextLine();
            
        }
        System.out.println("ACUMULADO = " + califa);
        promedio= califa / (cant * 1.0);//PARA PONERLO EN DOUBLE POR ESO EL 1.0
        System.out.println("PROMEDIO = " +promedio);
        
    }
    
}
