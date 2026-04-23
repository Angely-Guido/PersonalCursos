
package controlador;

import modelo.CalculadoraSwing;
import vista.Vista;

public class ControladorCalculadora {
    
    CalculadoraSwing modelo;
    Vista vista;
    private boolean arrancar;

    public ControladorCalculadora(CalculadoraSwing modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.arrancar = true;
    }
    
    
    
    
    
}
