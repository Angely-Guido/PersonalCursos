import java.util.Scanner;
import java.time.LocalTime;


public class EjerciciosIteracion {

    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {
        int i = 1;

        while (i <= 10) {
            i++;

            System.out.println(i - 1);
        }
    }

    public void ejercicio2() {
        int num = 0;

        do {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();

        } while (num < 0);
        System.out.println("Gracias");

    }

    public void ejercicio3() {
        int num = 1;
        int acumulador = 0;

        while (num != 0) {

            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            acumulador += num;

        }
        System.out.println("Suma: " + acumulador);
    }

    public void ejercicio4() {
        int num = 1;

        System.out.println("Ingrese la tabla que desea ver: ");
        num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            int mult = num * i;

            System.out.println("Tabla de " + num + " x " + i + " = " + mult);
        }
    }

    public void ejercicio5() {

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("¡Despegue!");
    }

    public void ejercicio6() {

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void ejercicio7() {
        int n = 0;
        long resultado = 1;

        System.out.println("Ingrese un numero");
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            resultado *= i;

        }
        System.out.println(resultado);
    }

    public void ejercicio8() {

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 59; j++) {
                if (j < 10) {
                    System.out.println("0" + i + ":" + "0" + j);
                } else {
                    System.out.println("0" + i + ":" + j);
                }
            }
        }
    }

    public void ejercicio9() {

        int n = 0;
        System.out.println("Digite el tamaño: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void ejercicio10() {
        int n = 0;


        do {
            System.out.println("Menu" +
                    "\n 1. Saludar" +
                    "\n 2. Decir la hora" +
                    "\n 3. Salir ");

            System.out.println("Digite la opcion que desea:");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Hola, como estas?");
                    break;
                case 2:
                    LocalTime horaActual = LocalTime.now();
                    System.out.println("Hora actual: " + horaActual);
                    break;
                case 3:
                    System.out.println("Adios");
                default:
                    System.out.println("No existe dentro del menu");
            }
        } while (n != 3);
    }

    public void ejercicio11() {

        int n = 0;
        System.out.println("Digite el tamaño: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void ejercicio12() {

        int n = 0;
        int suma = 0;

        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            } else {
            }
        }
        System.out.println("La suma de los numeros pares hasta " + n + " es: " + suma);
    }

    public void ejercicio13() {
        int n = 0;
        int cont = 0;

        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();

        for (int i = n; i > 0; i -= 5) {

            System.out.println(i);
        }
    }

    public void ejercicio14() {

        int n = 0;

        System.out.println("Ingrese el tamaño: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }

    public void ejercicio15() {
        int n = 0;
        int nota = 0;
        int promedio = 0;

        System.out.print("Cuantas notas quieres ingresar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese la nota que obtuvo el estudiante: ");
            nota = sc.nextInt();
            promedio = (promedio + nota);
        }
        System.out.print("La suma de todas las notas es: " + promedio / n);
    }

    public void ejercicio16() {

        int n = 0;

        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print("("+i+",");
                System.out.print(j+")");

            }
        }
    }
}