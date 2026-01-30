import java.util.Scanner;
public class EstructurasDeDatos {

    Scanner sc = new Scanner(System.in);

    //Arrays

    public void arrays(){

        //Declaracion y creacion
        int [] numbers = new int[3];
        System.out.println(numbers);

        String[] names ={"Angely", "Info", "tecnology"};
        System.out.println(names);

        //Acceso

        System.out.println(numbers[0]);
        System.out.println(names[0]);

        System.out.println((new String[3])[0]);

        //Modificacion
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        System.out.println(names[2]);
        names[2] = "angeluperes@gmail.com";
        System.out.println(names[2]);
    }

    public void ejercicioarray1() {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int contadorPares = 0;

        for (int i = 0; i <= 9; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {

            }
        }
        System.out.println(contadorPares);
    }

    public void ejercicioarray2(){


    }
}