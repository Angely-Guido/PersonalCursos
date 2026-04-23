package dia_3;

import java.util.Arrays;

public class Ejercicios {
    public static void main(String[] args) {
        int [] unos = {1,1,1,0,1,1};
        int [][] sumaMatrices = {{1,2,3,4},
                                 {5,6,7,8},
                                 {9,1,2,3}};
        int[] vector = {1,2,3,5};

        //System.out.println(rachaDeUnos(unos));
        //System.out.println(detectorDeAnagramas("roma", "amor"));
        //System.out.println(sumaDeMarco(sumaMatrices));
        //System.out.println(laFilaMasPesada(sumaMatrices));
        System.out.println("Antes: " + Arrays.toString(vector));
        rotacionAladerecha(vector);
        System.out.println("Después: " + Arrays.toString(vector));


    }

    public static int rachaDeUnos(int[] vector) {
        int contador = 0;
        int rachaMaxima = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 1) {
                contador++;
            } else {
                if (contador > rachaMaxima) {
                    rachaMaxima = contador;
                    contador = 0;
                }
            }
        }
        if (contador > rachaMaxima) {
            rachaMaxima = contador;
        }
        return rachaMaxima;
    }

    public static boolean detectorDeAnagramas(String palabra1, String palabra2){
        int coincidencias = 0;

        char [] palabra_1 = palabra1.toCharArray();
        char [] palabra_2 = palabra2.toCharArray();

        for (int i = 0; i < palabra_1.length; i++) {
            for (int j = 0; j < palabra_2.length; j++) {
                if(palabra_1[i] == palabra_2[j]){
                    coincidencias++;
                    break;
                }
            }
        }
        return coincidencias == palabra_1.length && coincidencias == palabra_2.length;
    }

    public static int sumaDeMarco(int[][] matriz) {
        int sumaMatriz = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
                    sumaMatriz = sumaMatriz + matriz[i][j];
                }
            }
        }
        return sumaMatriz;
    }

    public static int laFilaMasPesada(int[][] matriz) {
        int sumaMatriz = 0;
        int SumaFilaMayor = 0;
        int filaMayor = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                sumaMatriz = sumaMatriz + matriz[fila][columna];
            }
            if (sumaMatriz > SumaFilaMayor) {
                SumaFilaMayor = sumaMatriz;
                sumaMatriz = 0;
                filaMayor = fila;
            }
        }
        return filaMayor;
    }

    public static int elNumeroFaltante(int [] vector){
        int sumaTotal = 0;
        int sumaPosible = 0;
        for (int i = 0; i < vector.length ; i++) {
            sumaTotal = sumaTotal + vector[i];

        }
        sumaPosible = (vector.length + 1) * (vector.length + 2) / 2;
        return sumaPosible - sumaTotal;

    }

    public static void rotacionAladerecha(int [] vector){
        int ultima = vector[vector.length-1];
        for (int i = vector.length-1; i > 0 ; i--) {
            vector[i] = vector[i-1];

        }
        vector[0] = ultima;
    }
}