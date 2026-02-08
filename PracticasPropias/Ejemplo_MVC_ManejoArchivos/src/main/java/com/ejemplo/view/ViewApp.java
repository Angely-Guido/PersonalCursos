package com.ejemplo.view;

import javax.swing.*;

public class ViewApp {

    public int mostrarMenu(){
        String [] opciones = {"Agregar Producto", "Ver inventario", "Salir"};

        return JOptionPane.showOptionDialog(
                null,
                "Que opcion accion desea realizar?",
                "Menu de inventario",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]

        );
    }

    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Sistema de inventario", JOptionPane.PLAIN_MESSAGE);
    }

    public int obtenerIdProducto(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Id del producto:"));
    }

    public String obtenerNombreProducto(){
        return JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:");
    }

    public double obtenerPrecioProducto(){
        return Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto:"));
    }

    public int obtenerCantidadProducto(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad del producto:"));
    }



}