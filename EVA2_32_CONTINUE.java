/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_continue;

/**
 *
 * @author lujan
 */
public class EVA2_32_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NUMEROS PARES
        
        for(int i = 0; i <=20; i++) {
            //PARA SABER SI ES PAR, ME INTERESA EL RESIDUO DE DIVIDIR
            //ENTRE DOS
            int residuo = i % 2;
            if(residuo == 0){//EL NUMERO ES PAR
                System.out.print(i +" - ");
                continue;//SOLO INTERRUMPE LA ITERACION ACTUAL
            }
            System.out.println("SI EL NUMERO ES PAR, ESTO NO SE IMPRIME");
            
            
        }
    }
    
}
