package com.ejemplo.persistencia;

import com.ejemplo.model.Producto;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaApp {
    File carpeta = new File("Carpeta Data");
    File listaProductos;
    boolean creada = false;

    public PersistenciaApp(){
        if(!carpeta.exists()){
            creada = carpeta.mkdir();
            }
            listaProductos = new File(carpeta, "Lista_Productos.txt");

        }

    public String guardarProductos(String infProducto){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(listaProductos, true))){
            escritor.write(infProducto);
            escritor.newLine();
            return "Agregado con exito";
        }catch (IOException e){
            return e.getMessage();
        }
    }

    public List<String> leerArchivo(){
        List<String> lineas = new ArrayList<>();

        if(!listaProductos.exists()){
            return lineas;
        }

        try(BufferedReader lector = new BufferedReader(new FileReader(listaProductos))){
            String linea;
            while((linea = lector.readLine()) != null){
                lineas.add(linea);
            }
        }catch (IOException e){
            System.out.println("Error leyendo archivo: " +e.getMessage());
        }
        return lineas;
    }
}

