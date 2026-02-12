package ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compra {
    File archivo = new File("compras.txt");
    private List<String> listaProductos = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void agregarProductos(String producto){
        listaProductos.add(producto);
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))){
            escritor.write(producto);
            escritor.newLine();

            System.out.println("Producto agregado con exito!");

        }catch (IOException e){
            System.out.println("Error, no se pudo agregar el producto" + e.getMessage());

        }
    }

    public void mostrarProductos(){
        for(String lista : listaProductos){
            System.out.println(lista);
        }
    }

    public void cargarLista(){

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                listaProductos.add(linea);

            }

        } catch (IOException e) {
            System.out.println("Error, no se pudo cargar los datos" + e.getMessage());
        }
    }

    public void infoProducto(){
        System.out.println("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.println("Cantidad: ");
        String cantidad = sc.nextLine();

        String infoProduc = nombre + ":" + cantidad;
        agregarProductos(infoProduc);

    }

}
