package com.ejemploCalcu.view;

import java.util.Scanner;

public class VMat {
    private Scanner scanner;

    public VMat(){
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu(){
        System.out.println("\033[36m ----CALCULADORA BASICA----");
        System.out.println("\033[33m 1. Suma");
        System.out.println("\033[33m 2. Resta");
        System.out.println("\033[33m 3. Multiplicacion");
        System.out.println("\033[33m 4. Division");
        System.out.println("\033[31m 5. Para salir");
    }

    public int optenerRespuesta(){
        System.out.println("Ingrese su opcion: ");
        return scanner.nextInt();

    }

    public void mostrarResultado(int total){
        System.out.println("\nEl resultado de la operacion es: " + total+"\n");
    }
    public int ingresarNumero1(){
        System.out.println("Ingrese el primer numero");
        return scanner.nextInt();
    }

    public int ingresarNumero2(){
        System.out.println("Ingrese el segundo numero");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

}
