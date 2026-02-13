package ejerciciosString;

import java.util.Scanner;

public class Nivel_3_LogicaValidacion {
Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Nivel_3_LogicaValidacion n = new Nivel_3_LogicaValidacion();
        //System.out.println(n.validadorDeCarnéUniversitario());
        //n.comparadorDeContraseñas();
        n.desglosandoUnaFecha();

    }

    public boolean validadorDeCarnéUniversitario(){
        System.out.println("Ingrese su carnet universitario: ");
        String carnet = sc.nextLine();

        if (carnet.length() == 6 && Character.isUpperCase(carnet.charAt(0))){
            return true;
        }else if(carnet.length() < 6){
            return false;
        }
        else{
            return false;
        }
    }

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
    }

    public void desglosandoUnaFecha(){

        System.out.println("Ingrese la fecha (\"dd/MM/aaaa\"): ");
        String fecha = sc.nextLine();

        String [] formatFecha = fecha.split("/");
        System.out.println("Dia: " + formatFecha[0]);
        System.out.println("Mes: " + formatFecha[1]);
        System.out.println("Año: " + formatFecha[2]);
    }
}
