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

        try {
            System.out.println(potencia(2, -9));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        */

        //System.out.println(Ejercicios.desplazarMayuscula('Y', 53));
        //System.out.println(Ejercicios.pirámideInvertida(4, "*"));
        //System.out.println(Ejercicios.linea(4, '*'));
        //System.out.println(Ejercicios.lineaVertical(5, '*'));
        //System.out.println(Ejercicios.cuadrado(3, '*'));
        //System.out.println(Ejercicios.trianguloIzquierdo(4, '*'));
        //System.out.println(Ejercicios.cuadradoHueco(4, '*'));
        //System.out.println(Ejercicios.triánguloInvertidoIzquierdo(4, '*'));
        //System.out.println(Ejercicios.triánguloDerechoCreciente(3, '*'));
        //System.out.println(Ejercicios.triángulo(4, '*'));
        System.out.println(Ejercicios.diamante(4, '*'));

    }

    static StringBuilder sb = new StringBuilder();


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

    public static char desplazarMayuscula(char c, int shift) {
        shift = (shift > 25) ? shift % 25 : shift;
        if (c >= 'A' && c < 'Z') {
            if (Character.isUpperCase(c)) {

                return (char) (c + shift);

            }
        } else if (c == 'Z') {
            if (Character.isUpperCase(c)) {
                c = 'A';
                return (char) (c + shift - 1);
            }
        }
        return c;
    }

    public static String pirámideInvertida(int altura, char simbolo) {


        for (int i = 0; i < altura; i++) {//filas
            for (int j = 0; j < i + 1; j++) {//imprimir espacios
                sb.append(" ");
                for (int k = 0; k < (2 * altura) - 1; k++) {// imprimir simbolos
                    sb.append(simbolo);
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String linea(int n, char simbolo) {
        for (int i = 0; i < n; i++) {
            sb.append(simbolo);
        }
        return sb.toString();
    }

    public static String lineaVertical(int n, char simbolo) {
        for (int i = 0; i < n; i++) {
            sb.append(simbolo);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String cuadrado(int tamaño, char simbolo) {
        for (int i = 0; i < tamaño; i++) { //fila
            for (int j = 0; j < tamaño; j++) {//columna
                sb.append(simbolo);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String trianguloIzquierdo(int altura, char simbolo) {
        for (int i = 0; i <= altura; i++) { //fila
            for (int j = 0; j <= i; j++) {//columna, asteriscos
                sb.append(simbolo);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String cuadradoHueco(int ancho, char simbolo) {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == ancho - 1 || j == 0 || j == ancho - 1) {
                    sb.append(simbolo);
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String triánguloInvertidoIzquierdo(int altura, char simbolo) {
        for (int fila = altura; fila > 0 ; fila--) {
            for (int columna = 0; columna < fila ; columna++) {
                sb.append(simbolo);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static StringBuilder triánguloDerechoCreciente(int altura, char simbolo) {
        for (int fila = 1; fila <= altura; fila++) {//filas
            for (int espacio = 1; espacio <= altura - fila; espacio++) {//espacios
                sb.append(" ");
            }
            for (int asterisco = 1; asterisco <= fila; asterisco++) {//asteriscos
                sb.append(simbolo);
            }
            sb.append("\n");
        }
        return sb;
    }
    public static StringBuilder triángulo(int altura, char simbolo) {

        for (int fila = 1; fila <=altura ; fila++) {

            for (int espacio = 1; espacio <=altura-fila ; espacio++) {
                sb.append(" ");
            }
            for (int asterisco = 1; asterisco <=(fila*2)-1 ; asterisco++) {
                sb.append(simbolo);
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder diamante(int altura, char simbolo) {
        for (int fila = 1; fila <=altura ; fila++) {

            for (int espacios = 1; espacios <=altura-fila ; espacios++) {
                sb.append(" ");
            }
            for (int asteriscos = 1; asteriscos <=(fila*2)-1 ; asteriscos++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int fila = altura-1; fila >= 1 ; fila--) {

            for (int espacio = 1; espacio <=altura-fila ; espacio++) {
                sb.append(" ");
            }
            for (int asterisco = 1; asterisco <=(fila*2)-1 ; asterisco++) {
                sb.append(simbolo);
            }
            sb.append("\n");
        }
        return sb;
    }
}
