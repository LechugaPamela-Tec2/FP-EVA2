/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CASO 1: 5 = 5 X 4 X 3 X 2 X 1=120
        //
        
        
        int nume, facto = 1;//TIENEQUE TENER UN 1 PARA ARRANCAR
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("CUANTAS CALFICACIONES VAS A CAPTURAR?");
        nume = captu.nextInt();
        captu.nextLine();
        
        for(int i = 1; i <= nume; i ++){//for(int i = 14; i < cant; i++)
           //OPERACION 
           facto = facto * i;//ACUMULADOR (EN MULTIPLICACIONES, DEBE INICIAR EN 1)
        }
            for(int i = num; i >=1 --){
                facto = facto * i;
            }
            System.out.println("FACTORIAL DE "  + nume + "="+ facto);
            //CASO 2: 1 X 2 X 3 X 4 X 5= 120
            
            
    }
    
}
