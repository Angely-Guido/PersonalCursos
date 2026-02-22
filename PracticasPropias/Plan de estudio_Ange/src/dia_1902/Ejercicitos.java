package dia_1902;

public class Ejercicitos {
    public static void main(String[] args) {
        int [] numeros = {1,3,6};

      //  inversor("java");
       // System.out.println(reversa("super"));
        //System.out.println(contadorVocales("renacuajo"));
       // System.out.print(contadorVocales();
        //System.out.println(sumaDigitos(4444));
        //fizzBuzz(20);
        //System.out.println(mayorDelArreglo(numeros));
        System.out.println(buscadorDeDuplicados2(numeros));
    }

    public static void inversor(String palabra) {
        String reverso = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            reverso += palabra.charAt(i);

        }
        System.out.println(reverso);
    }

    public static String reversa(String palabra){
        String palabraInvertida = "";

       char[] nuevaArray = palabra.toCharArray();

        for (int i = nuevaArray.length-1; i >= 0 ; i--) {
            palabraInvertida += nuevaArray[i];

        }
        return palabraInvertida;
    }

    public static int contadorVocales(String palabra) {
        int contador = 0;

        for (int i = 0; i <= palabra.length() - 1; i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static int sumaDigitos(Integer numero) {
        int suma = 0;

      while(numero > 0){
          suma += (numero%10);
          numero = numero / 10;
        }
        return suma;
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static int mayorDelArreglo(int[] numeros) {
        int mayor = 0;

        for (int i = 0; i <= numeros.length - 1; i++) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public static boolean buscadorDeDuplicados(int[] numeros) {

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean buscadorDeDuplicados2(int[] numeros) {

        for (int i = 0; i <= numeros.length - 1; i++) {
            for (int j = i+1; j <= numeros.length-1 ; j++) {
                if(numeros[i] == numeros[j]){
                    return true;
                }

            }
        }
        return false;
    }
    
}
