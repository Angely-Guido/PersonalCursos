package generics;

import java.util.Arrays;

public class Ejemplo1MainGenerics {

    public static void main(String[] args) {

        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Hola mundo");
        String contenido = cajaString.obtenerAlgo();

        System.out.println("Contenido String es: " + contenido);

        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.ponerAlgo(19);
        Integer numero = cajaEnteros.obtenerAlgo();

        System.out.println("Contenido integer es: " +numero);

        String[] nombres = {"Ana", "Pedro", "Juan"};
        System.out.println("Nombres antes: " + Arrays.toString(nombres));
        Caja.intercambiar(nombres, 0, 2);
        System.out.println("Nombres despues: " + Arrays.toString(nombres));

        Integer[] numeros = {1,5,6};
        System.out.println("Numeros antes: " + Arrays.toString(numeros));
        Caja.intercambiar(numeros, 1, 2);
        System.out.println("Numeros despues: " + Arrays.toString(numeros));
    }
}
