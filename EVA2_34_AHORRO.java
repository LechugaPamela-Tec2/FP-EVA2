/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_ahorro;

/**
 *
 * @author lujan
 */
public class EVA2_34_AHORRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VAMOS A DEPOSITAR HASTA LLEGAR A LA META
        Scanner captu=  new Scanner(System.in);
        
        int ahorro= 15000;
        int deposito;
        int cuenta= 0;
        
        while(true){
            System.out.println("INTRODUCE EL DEPOSITO: ");
            deposito = captu.nextInt();
            //VERIFICAR SI NO NOS ESTAMOS PASANDO
            if((cuenta + deposito) > 1500){
                System.out.println("TE PASATE DE LA META ");
                continue;
                
            }
            cuenta += deposito;
            System.out.println("CUENTA = "+ cuenta);
            if (cuenta == 15000){//LLEGAMOS A LA META
                System.out.println("META CUMPLIDA ");
                break;//DETIENE  EL CICLO POR COMPLETO
            }
        }
        
    }
    
}
