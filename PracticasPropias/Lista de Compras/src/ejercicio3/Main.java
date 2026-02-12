package ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistrosDeCurso r = new RegistrosDeCurso();
        int opcion;

        do {
            System.out.println("---REGISTROS DE CURSOS---");
            System.out.println("1. Agregar curso");
            System.out.println("2. Mostrar registros");
            System.out.println("3. Salir");
            System.out.println();
            System.out.println("Ingrese la opcion que desea: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    String linea = r.agregarRegistro();
                    r.guardarRegistro(linea);
                }
                case 2 -> r.mostrarRegistros();
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalidad");
            }
        } while (opcion != 3);
    }
}
