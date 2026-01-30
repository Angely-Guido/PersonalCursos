package com.conversor.view;

import java.util.Scanner;

public class VMone {

    private Scanner scanner;

    public VMone() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        System.out.println("----CONVERSOR DE MONEDAS----");
        System.out.println("1. De dolares a colones");
        System.out.println("2. De colones a dolares");
        System.out.println("3. Salir");
    }

    public int selecionarOpcion(){
        System.out.println("Ingrese la opcion que desea: ");
        return scanner.nextInt();
    }

    public int ingresarDolares(){
        System.out.println("Ingrese la cantidad de dolares que desea convertir a colones");
        return scanner.nextInt();
    }
    public int ingresarColones(){
        System.out.println("Ingrese la cantidad de colones que desea convertir a dolares");
        return scanner.nextInt();
    }

    public void mostrarResultado(double total){
        System.out.println("La conversion es: " + total);
    }

    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
}
