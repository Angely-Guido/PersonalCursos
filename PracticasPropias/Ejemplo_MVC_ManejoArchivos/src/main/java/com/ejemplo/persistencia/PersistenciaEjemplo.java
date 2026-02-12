package com.ejemplo.persistencia;

import javax.swing.*;
import java.io.*;

public class PersistenciaEjemplo {

    File archivo = new File("productos.txt");

    public void guardarNombre(String nombre){
        try {
            FileWriter archivoEditable = new FileWriter(archivo);
            BufferedWriter escritor = new BufferedWriter(archivoEditable);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void guardarNombre2(String nombre){
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))){
            escritor.write("\nNombre: " + nombre);
            escritor.newLine();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void leerArchivo(){
        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            String linea = "";
            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) throws IOException{

        PersistenciaEjemplo ejem = new PersistenciaEjemplo();

        int cantNombre = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de nombres: "));
        for (int i = 0; i < cantNombre; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
            ejem.guardarNombre2(nombre);

        }
        ejem.leerArchivo();
    }
}