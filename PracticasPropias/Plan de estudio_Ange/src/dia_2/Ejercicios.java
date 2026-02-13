package dia_2;

public class Ejercicios {

    public static void main(String[] args) {
/*
        try {
            System.out.println(sumaHasta(8));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sumaMultiplos(7, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        /
 */
        try {
            System.out.println(potencia(2, -9));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }


    public static int sumaHasta(int n) throws IllegalArgumentException {
        int suma = 0;

        if (n <= 0) {
            throw new IllegalArgumentException("Error, no se puede con cero");
        } else {
            for (int i = 1; i <= n; i++) {
                suma += i;
                //return suma;
            }
        }
        return suma;
    }

    public static int sumaMultiplos(int n, int k) throws IllegalArgumentException {
        int suma = 0;

        if (n <= 0 || k <= 0) {
            throw new IllegalArgumentException("Error, no se puede con cero");
        } else {
            for (int i = 0; i < n; i++) {
                if (i % k == 0) {
                    suma += i;
                }
            }
        }
        return suma;
    }

    public static long potencia(int base, int exp) {
        int potenc = 1;
        if (exp < 0) {
            throw new IllegalArgumentException("Error, no se puede realizar la operacion");
        } else if (exp == 0) {
            return 1;
        } else {
            for (int i = 1; i <= exp; i++) {
                potenc = potenc * base;

            }
            return potenc;
        }
    }

}