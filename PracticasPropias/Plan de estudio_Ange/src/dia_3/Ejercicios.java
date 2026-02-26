package dia_3;

public class Ejercicios {
    public static void main(String[] args) {
        int [] unos = {1,1,1,0,1,1};
        int [][] sumaMatrices = {{1,2,3,4},
                                 {5,6,7,8},
                                 {9,1,2,3}};

        //System.out.println(rachaDeUnos(unos));
        //System.out.println(detectorDeAnagramas("roma", "amor"));
        //System.out.println(sumaDeMarco(sumaMatrices));
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
}