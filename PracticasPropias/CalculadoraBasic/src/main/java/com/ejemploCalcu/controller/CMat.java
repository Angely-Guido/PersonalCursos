package com.ejemploCalcu.controller;

import com.ejemploCalcu.model.MMat;
import com.ejemploCalcu.view.VMat;

public class CMat {
    private MMat modelo;
    private VMat vista;
    private boolean iniciar;

    public CMat(MMat modelo, VMat vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.iniciar = true;
    }

    public void iniciarApp(){
        while(iniciar){
            vista.mostrarMenu();
            elecciones(vista.optenerRespuesta());
        }

    }
    private void elecciones(int opcion){
        switch (opcion){
            case 1:
                hacerSuma();
                break;
            case 2:
                hacerResta();
                break;
            case 3:
                hacerMulti();
                break;
            case 4:
                hacerDiv();
                break;
            case 5:
                cerrar();
                break;
            default:
                vista.mostrarMensaje("Opcion invalida.");
        }
    }

    private void hacerSuma(){
        int n1 = vista.ingresarNumero1();
        int n2 = vista.ingresarNumero2();
        int total = modelo.suma(n1, n2);
        vista.mostrarResultado(total);
    }

    private void hacerResta(){
        int n1 = vista.ingresarNumero1();
        int n2 = vista.ingresarNumero2();
        int total = modelo.resta(n1, n2);
        vista.mostrarResultado(total);
    }

    private void hacerMulti(){
        vista.mostrarResultado(modelo.multiplicacion(vista.ingresarNumero1(), vista.ingresarNumero2()));
    }

    private void hacerDiv(){
        vista.mostrarResultado(modelo.division(vista.ingresarNumero1(), vista.ingresarNumero2()));
    }

    private void cerrar(){
        vista.mostrarMensaje("Este programa a cerrado");
        iniciar = false;
    }
}
