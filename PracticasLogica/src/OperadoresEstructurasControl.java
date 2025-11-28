import java.util.Scanner;

public class OperadoresEstructurasControl {
    Scanner sc = new Scanner(System.in);

//Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
// * Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...

    public void aritmeticos() {

        int num1 = 2;
        int num2 = 3;

        int suma = num1 + num2;
        int resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        double modulo = num1 % num2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
        System.out.println("El resultado del mudulo es: " + modulo);

    }

    public void logicos(){

        int edad = 17;

        if(edad > 12 && edad <18){
            System.out.println("Es un adolecente");
        }

        else if(edad > 18 || edad <30){
            System.out.println("Es un adulto");
        }

        else if (edad!=0){
            System.out.println("Eres un extraterrestre");

        }

    }

    public void comparacion(){

        int caliente = 100;

        if (caliente == 90){
            System.out.println("Pertenece al elemento solar");
        }

        if (caliente != 75){
            System.out.println("Pertenece a algo muy extraño");
        }

        if (caliente > 49){
        System.out.println("Tiene posibilidades al elemento niebla");
        }

        if (caliente < 0) {
            System.out.println("Es del clan del hielo");
        }

        if (caliente >= 70) {
            System.out.println("Tiene poderes super poderosos");
        }

        if(caliente <= 50){
            System.out.println("Tiene ascendencia ancestral del reino Choruka");
        }

        }

        public void asignacion(){

        int muto = 22;
            System.out.println("El resultado de = es: " + muto);
            muto += 5;
            System.out.println("El resultado de += es: " + muto);
            muto -=10;
            System.out.println("El resultado de -+ es: " + muto);
            muto *= 3;
            System.out.println("El resultado de *= es: " + muto);
            muto /= 6;
            System.out.println("El resultado de /= es: "+ muto);
            muto %= 1;
            System.out.println("El resultado de %= es: "+ muto);
            muto &= 4;
            System.out.println("El resultado de &= es: "+ muto);
            muto |= 5;
            System.out.println("El resultado de |= es: " + muto);
            muto ^= 20;
            System.out.println("Rl resultado de ^= es: " + muto);
            muto >>= 22;
            System.out.println("El resultado de >>= es: " + muto);
            muto <<= 22;
            System.out.println("El resultado de <<= es: " + muto);
        }

        public void bitAbit(){

        int lindo = 13;
        int feo = 10;
        int duo = lindo&feo;
        int vuelta = ~lindo;
        int w = lindo|feo;
        int u = lindo^feo;
        int r = lindo<<feo;
        int t = lindo>>feo;

            System.out.println(Integer.toBinaryString(lindo));
            System.out.println(Integer.toBinaryString(feo));
            System.out.println(Integer.toBinaryString(duo));
            System.out.println(Integer.toBinaryString(vuelta));
            System.out.println(Integer.toBinaryString(w));
            System.out.println(Integer.toBinaryString(u));
            System.out.println(Integer.toBinaryString(r));
            System.out.println(Integer.toBinaryString(t));

        }

        //Estructuras de control

    public void estrucIf() {

        int nun1 = 5;

        if (nun1 > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }

        public void estrucelseif(){

            int edad = 17;

            if (edad >= 18){
                System.out.println("Puedes misiones mas peligrosas");
        }
            else if (edad<18){
                System.out.println("Tienes misiones menos peligrosas");

            }

    }

        public void estrucFor(){

            int num = 20;

            for(int i =0; i<num; i++){
                System.out.println(i);

            }

            Scanner sc = new Scanner(System.in);

            int mult;

            System.out.println("Ingrese un numero: ");
            int num2 = sc.nextInt();

                for (int j = 0; j <= 10; j++) {
                    mult = num2*j;

                    System.out.println("Tabla del "+ num2+ "x"+ j + "="+ mult);
                }
        }

        public void estrucDoWhile(){
                Scanner sc = new Scanner(System.in);

                //Pide adivinar un número secreto y repite hasta acertarlo

                int numerosecre;

                do {
                    System.out.println("Prueba tu suerte, adivina el numero: ");
                numerosecre = sc.nextInt();

                }
                while(numerosecre != 2);
                System.out.println("Acertaste");

            }

    public void estructWhile(){

        //Pide números hasta que el usuario escriba un número negativo

        int nut = 0;

        while (nut >= 0){

            System.out.println("Ingrese un numero: ");
            nut = sc.nextInt();

        }

        System.out.println("Chao!");
    }

    public void estructSwitc() {

        int metodo = 0;

        OperadoresEstructurasControl prue = new OperadoresEstructurasControl();

        System.out.println("---Metodos para llevar---" +
                "\n 1. Operador aritmetico" +
                "\n 2. Operador logico" +
                "\n 3. Operador de comparacion" +
                "\n 4. Operador de asignacion" +
                "\n 5. Operador bit a bit" +
                "\n 6. Estructura if" +
                "\n 7. Estructura else if" +
                "\n 8. Estructura for" +
                "\n 9. Estructura Do while" +
                "\n 10. Estrutura While");


        while (true) {

            System.out.println("Digite el metodo que desea: ");
            metodo = sc.nextInt();

            switch (metodo) {
                case 1:
                    prue.aritmeticos();
                    break;
                case 2:
                    prue.logicos();
                    break;
                case 3:
                    prue.comparacion();
                    break;
                case 4:
                    prue.asignacion();
                    break;
                case 5:
                    prue.bitAbit();
                    break;
                case 6:
                    prue.estrucIf();
                    break;
                case 7:
                    prue.estrucelseif();
                    break;
                case 8:
                    prue.estrucFor();
                    break;
                case 9:
                    prue.estrucDoWhile();
                    break;
                case 10:
                    prue.estructWhile();
                    break;
                default:
                    System.out.println("Ese metodo no existe");
            }
            if(metodo > 0 && metodo < 11){
                continue;
            } else{
                break;
            }


        }
    }

    }




