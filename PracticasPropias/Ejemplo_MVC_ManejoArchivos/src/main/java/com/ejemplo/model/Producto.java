package com.ejemplo.model;

public class Producto {
    private int idProduct;
    private String nombreProduct;
    private double precio;
    private int stock;

    public Producto(int idProduct, String nombreProduct, double precio, int stock) {
        this.idProduct = idProduct;
        this.nombreProduct = nombreProduct;
        this.precio = precio;
        this.stock = stock;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNombreProduct() {
        return nombreProduct;
    }

    public void setNombreProduct(String nombreProduct) {
        this.nombreProduct = nombreProduct;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return idProduct + " | " + nombreProduct + " | " + precio + " | " + stock;
    }
}