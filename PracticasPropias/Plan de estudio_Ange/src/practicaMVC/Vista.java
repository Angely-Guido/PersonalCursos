package practicaMVC;

import java.util.Scanner;

public class Vista {
    Scanner sc = new Scanner(System.in);

    public Vista() {
    }

    public void menuPrincipal(){
        System.out.println("---GESTOR DE CITAS---");
        System.out.println("1. Guardar nueva cita");
        System.out.println("2. Mostrar todas las citas");
        System.out.println("3. Buscar paciente");
        System.out.println("4. Salir del sistema");

        System.out.println("Ingrese la opcion que desea: ");

    }



}
