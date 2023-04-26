/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_decorador;

/**
 *
 * @author Carvajal
 */
public class Recordatorio_txt extends AbstractDecorator {
    public void doJob(int mes) {                
        if (mes <=3) {
            System.out.println(" El prestamo del cliente ha expirado ");
        }
        else{
        super.doJob();        
        System.out.println(" El cliente aun tiene tiempo para la devolucion del articulo ");
        }
    }
}
