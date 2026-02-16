package ejerciciosString;

import java.util.Scanner;

public class Nivel_3_LogicaValidacion {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Nivel_3_LogicaValidacion n = new Nivel_3_LogicaValidacion();
        //System.out.println(n.validadorDeCarnéUniversitario());
        //n.comparadorDeContraseñas();
        //n.desglosandoUnaFecha();
        //n.generadorDeAcrónimos();
        n.elValidadorDeSKU();

    }

    public boolean validadorDeCarnéUniversitario() {
        System.out.println("Ingrese su carnet universitario: ");
        String carnet = sc.nextLine();

        if (carnet.length() == 6 && Character.isUpperCase(carnet.charAt(0))) {
            return true;
        } else if (carnet.length() < 6) {
            return false;
        } else {
            return false;
        }
    }//end method

    public void comparadorDeContraseñas() {
        System.out.println("Ingrese su contraseña: ");
        String contrasena = sc.nextLine();

        System.out.println("Vuelva a ingresar su contraseña: ");
        String contrasena2 = sc.nextLine();

        if (contrasena.equals(contrasena2)) {
            System.out.println("Las contraseñas coinciden");
        } else {
            System.out.println("Las contraseñas no coinciden");
        }
    }//end method

    public void desglosandoUnaFecha() {

        System.out.println("Ingrese la fecha (\"dd/MM/aaaa\"): ");
        String fecha = sc.nextLine();

        String[] formatFecha = fecha.split("/");
        System.out.println("Dia: " + formatFecha[0]);
        System.out.println("Mes: " + formatFecha[1]);
        System.out.println("Año: " + formatFecha[2]);
    }//end method

    public void generadorDeAcrónimos() {

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine().toUpperCase();

        String[] acro = frase.split(" ");
        for (int i = 0; i < acro.length; i++) {
            char primera = acro[i].charAt(0);
            System.out.print(primera);
        }

    }//end method

    public void elValidadorDeSKU() {
        System.out.println("Ingrese el SKU (Codigo de producto): ");
        String sku = sc.nextLine();

        String [] codigo = sku.split("-");
        if(codigo.length != 3){
            System.out.println("Formato invalido");
        }
            if (codigo[0].equalsIgnoreCase("PDF") && codigo[1].length() == 3 && codigo[2].length() == 2){
                System.out.println("Valido");
            }else{
                System.out.println("Invalido");
            }
        }
    }//end method
