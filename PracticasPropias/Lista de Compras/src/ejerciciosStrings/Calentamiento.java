package ejerciciosStrings;
import java.util.Locale;
import java.util.Scanner;

public class Calentamiento {

    Scanner sc = new Scanner(System.in);

    public void limpiadorDeDatos() {
        System.out.println("Ingrese un nombre");
        String nombre = sc.nextLine().trim();
        String primeraLetras = nombre.substring(0, 1).toUpperCase();
        String restoPalabra = nombre.substring(1).toLowerCase();
        String nombreForm = primeraLetras + restoPalabra;

        System.out.println("El nombre es " + nombreForm);

    }//end limpiadorDeDatos

    public void contadorDeLetras() {
        System.out.println("Ingrese una palabra");
        String nombre = sc.nextLine();
        System.out.println(nombre.trim().length());
    }//end contadorDeLetras

    public void extractorDeCorreos() {
        System.out.println("Ingrese un correo: ");
        String correo = sc.nextLine();

        if (correo.contains("@")) {
            int posicion = correo.indexOf("@");
            String palabra = correo.substring(0, posicion);
            System.out.println("Nombre de usuario: " + palabra);
        } else {
            System.out.println("Correo invalido");
        }
    }// end extractorDeCorreos

    public boolean analistaDeArchivos(){
        System.out.println("Ingrese el nombre del archivo:");
        String archivo = sc.nextLine();

        if(archivo.endsWith(".png") || archivo.endsWith(".jpg")) {

            return true;
        }else{
            return false;
        }
    }//end analistaDeArchivos

    public void buscadorDePalabrasProhibidas() {
        System.out.println("Ingrese la frase: ");
        String frase = sc.nextLine();

        System.out.println("Palabra a censurar:");
        String mala = sc.nextLine();

        String censurada ="";
        for (int i = 0; i < mala.length(); i++) {
            censurada += "*";
        }

        String palabraCensurada = frase.replace(mala, censurada);
        System.out.println(palabraCensurada);

    }//end buscadorDePalabrasProhibidas


}

