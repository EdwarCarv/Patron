/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrones_decorador;

import java.util.Scanner;

/**
 *
 * @author Carvajal
 */
public class DecoratorPatternEx {

    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        Recordatorio_txt cd_1 = new Recordatorio_txt();
        Recordatorio_mail cd_2 = new Recordatorio_mail(); 
        
        System.out.println("Elija la forma de la que quiere ser notificado para fecha limite de prestamo de libro y revista\n"
                + "1. Aviso medio TxT.\n"
                + "2. Aviso medio correo.\n"
                + "3. Aviso medio TxT y Correo.\n");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println(" A seleccionado aviso por TXT ");                
                cd_1.SetTheComponent(cc);
                cd_1.doJob(1);
                break;
            case 2:
                System.out.println(" A seleccionado aviso por correo ");                                
                cd_2.SetTheComponent(cc);
                cd_2.doJob(1);
                break;
            case 3:
                System.out.println(" A seleccionado aviso por coreo y por TXT");
                cd_1.SetTheComponent(cc);
                cd_1.doJob(1);
                cd_2.SetTheComponent(cd_1);
                cd_2.doJob(1);
                break;                
            default:
                System.exit(0);
                break;
                    
                
        }
    }
}
