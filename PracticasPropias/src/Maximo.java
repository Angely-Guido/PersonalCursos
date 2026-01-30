public class Maximo {

    public static void main(String[] args) {

        int [] numeros = {15, 34, 3, 6, 9};
        int maximo = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]> maximo){
                maximo = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + maximo);
    }
}
