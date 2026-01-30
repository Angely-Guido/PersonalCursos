package com.conversor.controller;

import com.conversor.model.MMone;
import com.conversor.view.VMone;

public class CMone {

    private MMone modelo;
    private VMone vista;
    private boolean iniciar;

    public CMone(MMone modelo, VMone vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.iniciar = true;
    }

    public void iniciarApp(){
        while (iniciar) {
            vista.mostrarMenu();
            int opcion = vista.selecionarOpcion();
            seleccionOpcion(opcion);
        }
    }

    private void seleccionOpcion(int opcion){
        switch (opcion){
            case 1:
                conversionColon();
                break;
            case 2:
                conversionDolares();
                break;
            case 3:
                cerrar();
                break;
            default:
               vista.mensaje("Opcion invalida");
        }
    }

    private void conversionColon(){
        vista.mostrarResultado(modelo.colones(vista.ingresarDolares()));
    }

    private void conversionDolares(){
        int colones = vista.ingresarColones();
        double total = modelo.dolares(colones);
        vista.mostrarResultado(total);
    }

    private void cerrar(){
        vista.mensaje("Saliendo...");
       iniciar = false;
    }

}
