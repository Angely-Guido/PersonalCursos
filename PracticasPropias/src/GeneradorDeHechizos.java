import java.util.Scanner;
import java.util.Random;
public class GeneradorDeHechizos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra;

        System.out.println("Que palabra deseas ingresar para convertir en hechizo? ");
        palabra = sc.nextLine().toLowerCase();

        String prefijo = obtenerPrefijo(palabra);
        String nucleo = obtenerNucleo(palabra);
        String sufijo = obtenerSufijo();

        String hechizo = prefijo + " " + nucleo + " " + sufijo;

        System.out.println("Tu hechizo mágico es:");
        System.out.println(hechizo);
    }

    public static String obtenerPrefijo(String palabra) {
        char primera = palabra.charAt(0);

        if (primera >= 'a' && primera <= 'f') {
            return "Astra";
        } else if (primera >= 'g' && primera <= 'l') {
            return "Lumina";
        } else if (primera >= 'm' && primera <= 'r') {
            return "Umbra";
        } else {
            return "Pyra";
        }
    }

    public static String obtenerNucleo(String palabra) {
        if (palabra.length() < 3) {
            return palabra.toUpperCase() + "-";
        }
        return palabra.substring(0, 3).toUpperCase() + "-";
    }

    public static String obtenerSufijo() {
        String[] elementos = {"ignis", "aqua", "terra", "ventus", "lux", "umbra"};
        Random random = new Random();
        return elementos[random.nextInt(elementos.length)];
    }
}

