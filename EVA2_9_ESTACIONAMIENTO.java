/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int tari1,tari2,tari3,tarialta;
         int tiempo;
         
         
        Scanner captu = new Scanner(System.in);
        System.out.println(">>>>>MENU DE ESTACIONAMIENTO<<<<<");
        
        System.out.println("SOLICITA EL NUMERO DE ESTACIONAMIENTO: ");
        tiempo =captu.nextInt();
       
       
        
        
        if(tiempo <= 2){
            tari1= tiempo * 25;
            System.out.println("DEBE DE DAR $" + tari1);
        }else if(tiempo <=5){
            tari2= tiempo * 20;
            System.out.println("DEBE DE DAR $ " + tari2);
        }else if(tiempo <=10){
            tari3= tiempo * 15; 
            System.out.println("DEBE DE DAR $ " + tari3);
        }else if(tiempo >=10){
            tarialta=tiempo * 150;
            System.out.println("TARIFA FIJA DE " + tarialta);
        }else {
            System.out.println("OPCION NO VALIDA ");
        }
            

}

    }
 
    
    