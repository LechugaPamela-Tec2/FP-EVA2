/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;

import java.util.Scanner;

/**
 *
 * @author lujan
 */
public class EVA2_11_ACCESO {
      final static String USUARIO ="admi";
      final static String PWD= "admi";
    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usuario, pwd;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("USUARIO:");
        usuario = captu.nextLine();
        System.out.println("CONTRASEÑA:");
        pwd = captu.nextLine();
        //usuaio.equals(USUARIO) UNA ALTERNATIVA
        if(usuario == USUARIO){
          if(pwd == PWD){
              System.out.println("ACCESO CONCEDIDO");
          }else{
               System.out.println("ACCESO DENEGADO");
          }
        }else{
             System.out.println("ACCESO DENEGADO");
        }
        } 
        
        
    }
    

