package com.ejemplo.controller;

import com.ejemplo.model.RepositorioProducto;
import com.ejemplo.view.ViewApp;

public class ControllerApp {

    private RepositorioProducto model;
    private ViewApp view;
    private boolean run;

    public ControllerApp(RepositorioProducto model, ViewApp view) {
        this.model = model;
        this.view = view;
        this.run = true;
    }

    public void iniciarApp(){
        while(run) {
            int seleccion = view.mostrarMenu();
            menuOpciones(seleccion);
        }
    }

    private void menuOpciones(int seleccion) {
        switch (seleccion) {
            case 0:
                añadirProducto();
                break;
            case 1:
                mostrarProductos();
                break;
            case 2:
                salir();
                break;
            default:
        }
    }
        private void añadirProducto(){
            int id = view.obtenerIdProducto();
            String nombre = view.obtenerNombreProducto();
            double precio = view.obtenerPrecioProducto();
            int cantidad = view.obtenerCantidadProducto();

            String mensaje = model.agregarProducto(id, nombre, precio, cantidad);
            view.mostrarMensaje(mensaje);
        }

        public void mostrarProductos(){
        String lista = model.verProductos();
        view.mostrarMensaje(lista);

        }

        private void salir(){
        view.mostrarMensaje("Hasta luego!");
        run = false;
        }
    }