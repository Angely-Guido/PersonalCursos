package sentenciasRepetitivas;

import java.util.ArrayList;
import java.util.Scanner;

public class sentencias {
    Scanner sc = new Scanner(System.in);


    public void calcularNotas() {
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int cont = 0;

        do {
            System.out.println("Ingrese la primera nota: ");
            nota1 = sc.nextInt();
            cont++;
            System.out.println("Ingrese la segunda nota: ");
            nota2 = sc.nextInt();
            cont++;
            System.out.println("Ingrese la tercera nota: ");
            nota3 = sc.nextInt();
            cont++;

        } while (!(nota1 >= 1 && nota1 <= 20 && nota2 >= 1 && nota2 <= 20 && nota3 >= 1 && nota3 <= 20));
         int resultado = (nota1 + nota2 + nota3)/3;
        System.out.println("Nota final: " + resultado);
    }


    public void calcularNotas2() {
        int nota1 = 0;
        int notaFinal = 0;
        int cont = 0;

        do {
            System.out.println("Ingrese la nota: ");
            nota1 = sc.nextInt();
            cont++;

        } while (nota1 >= 1 && nota1 <= 20  && cont<4);


        System.out.println("Nota final: ");
    }

    public void serieNumeros(){
        int suma = 0;
        for (int i = 1; i <= 99; i+=2) {
            System.out.println(i);
            suma += i;

        }
        System.out.println("Suma total de numeros: " + suma);

    }

    public void serieNumeros2(){
        int suma = 0;
        for (int i = 4; i <= 200; i+=4) {
            System.out.println(i);
            suma += i;

        }
        System.out.println("Suma total de numeros: " + suma);

    }

    public void serieNumeros3(){
        int suma = 0;
        int i = 4;
        while(i >= 4 && i <= 200){
            System.out.println(i);
            suma += i;
            i+=4;

        }
        System.out.println("Suma total de numeros: " + suma);

    }


    public static void main(String[] args) {
        sentencias s = new sentencias();
        ArrayList<String> r = new ArrayList<>();


        //s.calcularNotas();
        //s.serieNumeros();
        //s.serieNumeros2();
        s.serieNumeros3();

    }



}
