package com.ejemplo.model;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProducto {
    private List<Producto> productos;
    private static RepositorioProducto instance;

    private RepositorioProducto(){
        this.productos = new ArrayList<>();

        productos.add(new Producto(1, "Arroz", 1200, 4));
        productos.add(new Producto(2, "Aceite", 1300, 3));
    }
        public static synchronized RepositorioProducto getInstance(){
        if (instance == null){
            instance = new RepositorioProducto();
        }
        return instance;

    }

    public String agregarProducto(int id, String nombre, double precio, int cantidad){
        Producto producto = new Producto(id,nombre, precio, cantidad);
        productos.add(producto);
        return producto.toString();
    }

    public String verProductos(){
        String lista = "PRODUCTO DISPONIBLE";
        if(productos.isEmpty()){
            return "No hay productos agregado aun!";
        } else{

            for(Producto producto : productos){
                lista += "\nID: " + producto.getIdProduct()+
                        "\nNOMBRE: " + producto.getNombreProduct() +
                        "\nPRECIO: " + producto.getPrecio()+
                        "\nSTOCK: " + producto.getStock()+
                "\n °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°";
            }
        }
        return lista;
    }
}