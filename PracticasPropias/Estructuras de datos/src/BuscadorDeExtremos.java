import java.util.Arrays;

import static java.util.Arrays.stream;

public class BuscadorDeExtremos {

    public static void main(String[] args) {

        int[] numeros = {5, 3, 9, 1, 4};

        int max = numeros[0];
        int min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if(numeros[i] > max){
                    max = numeros[i];
                }
            }
        System.out.println("El numero mayor es: "+ max);
        System.out.println("El numero menor es: "+ min);
        }
    }

