package matrices;

import java.util.Scanner;

public class EjerciciosMatriz {

    public static void main(String[] args) {

        int[][] numeros = {
                {5, 10, 13, 15, 23},
                {99, 8, 3, 2, 1},
                {9, 13, 18, 19, 20}
        };

        //System.out.println(encontrarNumero(numeros, 3));
        //encontrarNum2(numeros, 2);
        //encontrarValorBordes(numeros);
        //encontrarValorCentro(numeros);
        //System.out.println(encontrarNumeroBorde(numeros, 15));

        //String[][] matriz = llenarMatriz();
        //System.out.println(moverseEnMatriz(matriz));

        //recorrerDerechaAIzquierda(numeros);

        String[][] matrizInv = llenarMatrizDerechaIzquierda();
        for (String[] fila : matrizInv) {
            for (String posicion : fila) {
                System.out.print(posicion);
            }
            System.out.println();
        }
    }

    public static boolean encontrarNumero(int[][] matriz, int numero) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (numero == matriz[fila][columna]) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void encontrarNum2(int[][] matriz, int numero) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (numero == matriz[fila][columna]) {
                    System.out.println("Se encontro el numero " + numero + " en la posicion " + "[" + fila + "]" + "[" + columna + "]");
                }
            }
        }
    }

    public static void encontrarValorBordes(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == 0 || fila == matriz.length - 1 || columna == 0 || columna == matriz[fila].length - 1) {
                    System.out.println("El valor " + matriz[fila][columna] + " esta en el borde");
                }
            }
        }
    }

    public static void encontrarValorCentro(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila != 0 && fila != matriz.length - 1 && columna != 0 && columna != matriz[fila].length - 1) {
                    System.out.println("El valor " + matriz[fila][columna] + " esta en el centro");
                }
            }
        }
    }

    public static boolean encontrarNumeroBorde(int[][] matriz, int numero) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == 0 || fila == matriz.length - 1 || columna == 0 || columna == matriz[fila].length - 1) {
                    if (numero == matriz[fila][columna]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String[][] llenarMatriz() {
        Scanner sc = new Scanner(System.in);

        System.out.println("De cuantas filas desea su matriz?: ");
        int filas = sc.nextInt();

        System.out.println("De cuantas columnas desea su matriz?: ");
        int columna = sc.nextInt();
        sc.nextLine();

        String[][] matriz = new String[filas][columna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Que valor desea guardar en las coordenadas " + "[" + i + "]" + "[" + j + "]?:");
                String num = sc.nextLine();
                matriz[i][j] = num;
            }
        }
        return matriz;
    }

    public static boolean moverseEnMatriz(String[][] matriz) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuales son las coordenadas donde quiere moverse? ");
        System.out.println("Fila:");
        int f = sc.nextInt();
        System.out.println("Columna:");
        int c = sc.nextInt();

        if (matriz[f][c].equals("-")) {
            return false;
        } else {
            return true;
        }
    }

    public static void recorrerDerechaAIzquierda(int[][] matriz) {
        for (int fila = matriz.length - 1; fila >= 0; fila--) {
            for (int columna = matriz[fila].length - 1; columna >= 0; columna--) {
                System.out.print(matriz[fila][columna]);
                if (columna != matriz[fila].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public static String [][] llenarMatrizDerechaIzquierda(){
        Scanner sc = new Scanner(System.in);

        System.out.println("De cuanto deseas que sea tu matriz? ");
        System.out.println("Filas: ");
        int fila = sc.nextInt();
        System.out.println("Columnas:");
        int columna = sc.nextInt();
        sc.nextLine();

        String[][] matriz = new String [fila][columna];
        for (int filas = matriz.length - 1; filas >= 0; filas--) {
            for (int columnas = matriz[filas].length - 1; columnas >= 0; columnas--) {
                System.out.println("Que valor desea guardar en las coordenadas " + "[" + filas + "]" + "[" + columnas + "]?:");
                String num = sc.nextLine();
                matriz[filas][columnas] = num;

            }
        }
        return matriz;
    }
}
