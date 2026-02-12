package com.ejemplo.controller;

import com.ejemplo.model.RepositorioProducto;
import com.ejemplo.persistencia.PersistenciaApp;
import com.ejemplo.view.ViewApp;

import java.util.List;

public class ControllerApp {

    private RepositorioProducto model;
    private ViewApp view;
    private boolean run;
    private PersistenciaApp data;

    public ControllerApp(RepositorioProducto model, ViewApp view, PersistenciaApp data) {
        this.model = model;
        this.view = view;
        this.run = true;
        this.data = data;
    }

    public void iniciarApp(){
        cargarDatos();
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
            data.guardarProductos(mensaje);

        }

        public void mostrarProductos(){
        String lista = model.verProductos();
        view.mostrarMensaje(lista);

        }

        private void salir(){
        view.mostrarMensaje("Hasta luego!");
        run = false;
        }

        private void cargarDatos(){

        view.mostrarMensaje("Cargando los datos");

            List<String> lineas = data.leerArchivo();

            for (String linea : lineas){
                try{
                    view.mostrarMensaje("entrando al try");
                    String[] partes = linea.split("\\|");
                    view.mostrarMensaje("arreglo creado");

                    if(partes.length == 4){
                        view.mostrarMensaje("entro al if");
                        int id = Integer.parseInt(partes[0]);
                        view.mostrarMensaje("se convertiio en int");
                        String nombre = partes[1];
                        view.mostrarMensaje("se agrego el nombre");
                        double precio = Double.parseDouble(partes[2]);
                        view.mostrarMensaje("se convertiio en double");

                        int stock = Integer.parseInt(partes[3]);
                        view.mostrarMensaje("se convertiio en int");

                        view.mostrarMensaje("por crearse el objeto");

                        model.agregarProducto(id, nombre, precio, stock);
                        view.mostrarMensaje("Dato cargado");
                    } else {
                        view.mostrarMensaje("Dato no cargado");
                    }

                }catch (Exception e){
                    view.mostrarMensaje(e.getMessage());
                }
            }
        }
    }