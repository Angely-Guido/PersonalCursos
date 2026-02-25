package dia_2V2;

public class Ejercicios {
    public static void main(String[] args) {

        int[] vectorUno = {10, 12, 13, 14};
        int[] vectorDos = {1, 2, 3, 4};
        int[] frecuencia = {1, 2, 3, 4, 4, 4};
        int[] polindromo ={1,2,1};
        int[] polindromo2 ={1,2,3,4,3,2,1};
        int [][] matriz = {{12,2,4,5},{3,6,23,8}};
        int [][] matriz2 = {{12,2,4,},
                            {3,6,23,},
                            {3,2,6}};

        int [][] otra = {{1,0,0},
                         {0,0,0},
                        {0,0,0}};
/*
        int[] nuevoVector = sumaArreglos(vectorUno,vectorDos);
        for(int vector : nuevoVector){
            System.out.print(vector + ",");
        }
*/
        //System.out.println(frecuenciaAbsoluta(frecuencia, 4));
        //System.out.println(polindromoNumerico(polindromo2));
        //matrizACero(matriz);
        //System.out.println(diagonalPrincipal(matriz2));
        //System.out.println(diagonalSecundaria(matriz2));
        /*
        int [][] nuevaMatriz = transposicionBase(matriz2);
        for(int[] fila : nuevaMatriz){
            for(int posicion : fila){
                System.out.print(posicion + " ");
            }
            System.out.println();
        }
        */


        int [][] otraMatriz = aplicarGravedad(otra);
        for(int[] fila : otraMatriz){
            for(int posicion : fila){
                System.out.print(posicion + " ");
            }
            System.out.println();
        }

    }

    public static int[] sumaArreglos(int[] vector1, int[] vector2) {
        int[] nuevoArreglo = new int[vector1.length];
        for (int i = 0; i <= vector1.length-1; i++) {
            nuevoArreglo[i] = vector1[i] + vector2[i];
        }
        return nuevoArreglo;
    }

    public static int frecuenciaAbsoluta(int[] vector, int objetivo){
        int contador = 0;
        for (int i = 0; i <= vector.length-1 ; i++) {
            if(vector[i] == objetivo){
                contador++;
            }
        }
        return contador;
    }

    public static boolean polindromoNumerico(int[] vector){
        int aumentar = 0;
        int combinaciones = 0;
        int[] v2 = new int [vector.length];
        for (int i = vector.length - 1; i >= 0; i--) {
            v2[aumentar++] = vector[i];
        }
        for (int k = 0; k < vector.length; k++) {
            if (vector[k] == v2[k]) {
                combinaciones++;
            }
            else{
                break;
            }
        }
        return combinaciones == vector.length;
    }

    public static void matrizACero(int[][] matriz){

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                if(matriz[i][j] % 2 != 0){
                    System.out.print(0 + ",");
                }else{
                    System.out.print(matriz[i][j] + ",");
                }
            }
            System.out.println();
        }
    }

    public static int diagonalPrincipal(int [][] matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                if(i == j){
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    public static int diagonalSecundaria(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    public static int[][] transposicionBase(int[][] matriz) {
        int[][] matriz2 = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz2[j][i] = matriz[i][j];
            }
        }
        return matriz2;
    }

    public static int[][] aplicarGravedad(int [][] tablero){
        int contador = 0;
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero[i].length ; j++) {
                if(tablero[i][j] == 1){
                    if(i != tablero.length-1 && tablero[i+1][j] == 0){
                        tablero[i][j] = 0;
                        tablero[i+1][j] = 1;
                        return tablero;
                    }
                }
            }
        }
        return tablero;
    }
}