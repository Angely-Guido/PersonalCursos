public class Arrays {

    public static void main(String[] args) {

        int [] numeros = {2,4,5,6,7};

        int suma = 0;
        int promedio = 0;

        for (int i = 0; i <numeros.length ; i++) {
            suma=+numeros[i];
        }
        promedio = suma / numeros.length;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
