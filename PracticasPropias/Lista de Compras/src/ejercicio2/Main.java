package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControlDeGastos c = new ControlDeGastos();
        int n;

        do{
            System.out.println("----CONTROL DE GASTOS----");
            System.out.println("1. Agregar gasto");
            System.out.println("2. Ver reporte");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.println("Ingrese la opcion que desea:");
            n = sc.nextInt();
            sc.nextLine();

            switch (n){
                case 1 -> c.registrarGastos();
                case 2 -> c.verReporte();
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida");


            }

        } while (n != 3);
    }
}
