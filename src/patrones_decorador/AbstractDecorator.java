/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_decorador;

/**
 *
 * @author Carvajal
 */
abstract class AbstractDecorator extends Component{
    protected Component com;

    public void SetTheComponent(Component c) {
        com = c;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}
