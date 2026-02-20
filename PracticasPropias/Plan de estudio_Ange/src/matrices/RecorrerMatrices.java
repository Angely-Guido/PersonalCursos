package matrices;

public class RecorrerMatrices {

    public static void main(String[] args) {

        int [][] numeros = {{1, 2, 3, 4},// fila 0
                {5, 3, 6, 7},//fila 1
                {3, 6, 8, 7},//fila 2
        };

        recorerrMatriz(numeros);

    }

        public static void recorerrMatriz(int [][] matriz){
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int  columna= 0; columna <matriz[fila].length ; columna++) {
                    System.out.print(matriz[fila][columna]);
                    if(columna != matriz[fila].length-1){
                        System.out.print("|");
                    }
                }
                System.out.println();

            }

        }

        public static void inicioFinForEach(int [][] matriz){
        for(int[]  fila: matriz){
            for(int posicion : fila){
                System.out.println(posicion);
            }
        }
        }

    }

