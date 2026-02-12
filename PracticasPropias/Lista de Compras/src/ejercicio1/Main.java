package ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Compra c = new Compra();
        c.cargarLista();

        int n;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---LISTA PRODUCTOS---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");

            System.out.println("Ingrese su opcion: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    c.infoProducto();
                    break;
                case 2:
                    c.mostrarProductos();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalidad");
            }
        }while(n != 3);

    }
}
