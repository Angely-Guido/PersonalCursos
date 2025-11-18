import java.util.Scanner;

public class PracticaPrimitivos {
    /*
Conversión de Unidades de Medida:
Declara una variable short para almacenar una cantidad de centímetros (ej. 25000).
Declara una variable int para el factor de conversión (ej. 1 metro = 100 cm).
Declara una variable float llamada metros.
Calcula el valor de metros (centímetros dividido por el factor) y usa el sufijo f para el literal flotante en la operación si es necesario.
Imprime el resultado usando System.out.println de forma descriptiva.

     */

    public void conversionUnidades() {

        short centimetros = 25000;
        int factor = 100;
        float metros;

        metros = centimetros / factor;

        System.out.println("La conversion de centimetros a metros es: " + metros);
    }

    /*
    Cálculo de Área con Tipos Flotantes:
    Declara una variable double para el radio de un círculo (ej. 15.5)3.
    Declara una constante (variable final) de tipo double para $\pi$ (ej. 3.14159).
    Calcula y almacena el área ($A = \pi \cdot r^2$) en una variable double llamada area.
    Imprime el resultado.
     */

    public void calculoArea(){

        double radioCirculo = 15.5;
        final double pi = 3.14159;

        double area = pi * (radioCirculo * radioCirculo);
        System.out.println("El area es " + area);
    }

    /*
    Verificación Lógica con boolean y if:
Declara una variable int llamada temperatura (ej. 28).
Declara una variable boolean llamada esVerano e inicialízala con true.
Usa una estructura if para verificar si esVerano es verdadero Y si temperatura es mayor que 25.
Si la condición se cumple, imprime: "¡Día de playa!". Si no se cumple, imprime: "Día normal.".
     */

    public void verificacionLogica(){

        int temperatura = 28;
        boolean esVerano = true;
         if(esVerano && temperatura>25) {
             System.out.println("¡Día de playa!");
         }
         else {
        System.out.println("Día normal");
         }

    }
    /*
    Uso del tipo char (Carácter UNICODE):
Declara una variable char llamada letraInicial e inicialízala con la letra inicial de tu nombre.
Declara una segunda variable char llamada simbolo e inicialízala con un código UNICODE que conozcas (ej. \u0040 para @).
Imprime ambas variables en la consola.
     */

    public void tipoChat(){

        char letraInicial = 'A';
        char simbolo = '\u0040';
        System.out.println("Caracteres tipo char son: " + letraInicial +" y "+ simbolo);
    }

    /*
    Práctica con Rango de Enteros:
Intenta declarar e inicializar una variable byte con un valor que exceda su valor máximo (ej. 128). Observa el error de compilación.
Corrige la variable inicializándola con el valor máximo de byte (127) y luego con el valor mínimo de byte (-128). Imprime ambos valores.
Repite el ejercicio con short (ej. 32767 y -32768).
     */

    public void rangoEnteros(){

        byte rangobyte = 127;
        System.out.println("rangobyte = " + rangobyte);
        System.out.println("El maximo de byte es: " + Byte.MAX_VALUE);
        System.out.println("El minimo de byte es: " + Byte.MIN_VALUE);

        short rangoShort = 32767;
        System.out.println("rangoShort = " + rangoShort);
        System.out.println("El maximo de short es: " + Short.MAX_VALUE);
        System.out.println("El minimo de short es: " + Short.MIN_VALUE);

    }

    /*
    Inferencia de Tipo con var:

Declara una variable var llamada edad e inicialízala con un entero (ej. 30).
Declara una variable var llamada salario e inicialízala con un valor flotante de doble precisión (ej. 55000.50).
Declara una variable var llamada esMayor e inicialízala con un booleano (true).
Imprime el tipo y valor de cada variable (aunque no se muestre el tipo explícitamente, recuerda que Java infiere el tipo de dato subyacente al momento de la inicialización).
     */

    public void inferenciaVar(){

        var edad = 30;
        var salario = 55000.50;
        var esMayor = true;

        System.out.println("edad = " + edad);
        System.out.println("salario = " + salario);
        System.out.println("esMayor = " + esMayor);

    }

    /*
Concatenación y Reglas de Nombres:
Crea una clase simple. Dentro del método main, declara una variable int con un nombre que incumpla las reglas (ej. 2nombre, if, o mi-variable) y observa el error.
Corrige el nombre usando la convención camelCase (ej. numeroDeProductos).
Declara una variable String (como lo hiciste en el ejemplo HelloWord.java) e inicialízala.
Imprime el valor de la variable entera concatenado con el String y un mensaje descriptivo, por ejemplo: "El número de productos es: " + numeroDeProductos.

     */

    public void reglasNombres(){

        int numeroDeProductos = 5;
        String  nombrePerson = "Angely";
        System.out.println(nombrePerson + " tiene este numero de productos: " + numeroDeProductos);

    }

    public static void main(String[] args) {

        PracticaPrimitivos prue = new PracticaPrimitivos();

            Scanner sc = new Scanner(System.in);

            int opcion;
        System.out.println("Digite un mumero para el metodo que desea");
            opcion =sc.nextInt();

        switch(opcion){
                case 1:
                    prue.conversionUnidades();
                    break;
            case 2:
                prue.calculoArea();
                break;
            case 3:
                prue.tipoChat();
                break;
            case 4:
                prue.verificacionLogica();
                break;
            case 5:
                prue.rangoEnteros();
                break;
            case 6:
                prue.inferenciaVar();
                break;
            case 7:
                prue.reglasNombres();
                break;
            default:
                System.out.println("Numero invalido");
            }
        }
    }



