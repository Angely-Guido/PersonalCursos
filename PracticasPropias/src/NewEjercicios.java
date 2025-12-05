import java.util.Scanner;

public class NewEjercicios {

    Scanner sc = new Scanner(System.in);

    public void positivo() {
        int numero = 0;

        System.out.println("Digite un numero: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Es positivo");
        }

    }

    public void aprobadoReprobado() {

        double nota = 0;

        System.out.println("Digite la nota que obtuvo");
        nota = sc.nextInt();

        if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");

        }

    }

    public void parImpar() {
        int numero = 0;

        System.out.println("Digite un numero");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("No es par");
        }

    }

    public void tiendaDescuentos() {

        double precio = 0;
        double precioFinal = 0;

        System.out.println("Digite el precio");
        precio = sc.nextInt();

        if (precio > 100) {
            double descuento = precio * 0.90;
            precioFinal = precio - descuento;
            System.out.println("El precio final con descuento es: " + precioFinal);
        } else {
            System.out.println("El precio queda igual al original");

        }

    }

    public void comparador() {
        int a;
        int b;

        System.out.println("Ingrese un numero");
        a = sc.nextInt();

        System.out.println("Ingrese un segundo numero");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("A es mayor");
        } else if (a < b) {
            System.out.println("B es mayor");
        } else {
            System.out.println("Son iguales");
        }

    }

    public void semaforo() {
        String color;
        System.out.println("Semaforo");
        System.out.println("Digite un color:");
        color = sc.nextLine().trim().toLowerCase();

        if (color.equals("rojo")) {
            System.out.println("Alto");
        } else if (color.equals("amarillo")) {
            System.out.println("Precaucion");
        } else if (color.equals("verde")) {
            System.out.println("Siga");
        } else {
            System.out.println("Color invalidado");
        }
    }

    public void loginBasic() {
        String usuario;
        String clave;

        System.out.println("Ingrese el nombre de usuario");
        usuario = sc.nextLine().toLowerCase();

        System.out.println("Ingrese su contraseña");
        clave = sc.nextLine();

        if (usuario.equals("admin") && clave.equals("1234")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }


    }

    public void cine() {

        int edad = 19;
        boolean tieneBoleto = false;
        boolean permiso = false;

        System.out.println("Digite su edad");
        edad = sc.nextInt();

        sc.nextLine();

        System.out.println("Tienes boleto?");
        String trboleto = sc.nextLine().trim().toLowerCase();

        if (trboleto.equals("si")) {
            tieneBoleto = true;
        }

        if (edad < 18) {
            System.out.println("Tienes permiso especial? (si/no)");
            String faboleto = sc.nextLine().trim().toLowerCase();

            if (faboleto.equals("si")) {
                permiso = true;
            } else {

            }

            if (tieneBoleto && (edad > 18 || permiso)) {

                System.out.println("Puedes entrar");
            } else {
                System.out.println("No puedes ingresar");
            }
        }

    }

    public void temperatura() {

        int temp;

        System.out.println("Ingrese la temperatura:");
        temp = sc.nextInt();

        if (temp < 10) {
            System.out.println("Mucho frio");
        } else if (temp >= 10 && temp <= 20) {
            System.out.println("Frio");
        } else if (temp >= 21 && temp <= 30) {
            System.out.println("Agradable");
        } else if (temp > 30) {
            System.out.println("Calor");
        }

    }

    public void diasSemana() {

        int dia;

        System.out.println("Digite un numero: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia Invalido");
        }

    }

    public void calculadoraBasica() {

        int num1 = 0;
        int num2 = 0;
        char operacion;

        System.out.println("---OPERACIONES---");
        System.out.println("+: suma" +
                "\n -: resta" +
                "\n *: multiplicacion" +
                "\n /: division");
        System.out.println("Digite la operacion que desea realizar:");
        operacion = sc.next().charAt(0);

        switch (operacion) {
            case '+':
                System.out.println("Digite dos numeros: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int suma = num1 + num2;

                System.out.println("El resultado de la suma es: " + suma);
                break;
            case '-':
                System.out.println("Digite dos numeros: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int resta = num1 - num2;

                System.out.println("El resultado de la suma es: " + resta);
                break;
            case '*':
                System.out.println("Digite dos numeros: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int multiplicacion = num1 * num2;

                System.out.println("El resultado de la suma es: " + multiplicacion);
                break;
            case '/':
                System.out.println("Digite dos numeros: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int division = num1 / num2;

                System.out.println("El resultado de la suma es: " + division);
                break;
            default:
                System.out.println("Caracter invalido");
        }

    }

    public void ternarioSimple() {
        int x = 1;

        System.out.println("Digite un numero:");
        x = sc.nextInt();

        String Valor = (x % 2 == 0) ? "Es par" : "Es impar";

        System.out.println(Valor);
    }

    public void cajeroAutomatico() {
        int saldo = 1000;
        int retiro = 0;

        System.out.println("Cuanto va a retirar: ");
        retiro = sc.nextInt();

        if (retiro > saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            if (retiro % 10 == 0) {
                saldo -= retiro;
                System.out.println("Nuevo saldo: " + saldo);

            } else {
                System.out.println("El cajero solo da billetes de 10");
            }
        }

    }

    public void notasAmericas() {
        int nota = 0;

        System.out.println("Dijite su nota: ");
        nota = sc.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("A");
        } else if (nota >= 80 && nota <= 89) {
            System.out.println("B");
        } else if (nota >= 70 && nota <= 79) {
            System.out.println("C");
        } else if (nota >= 60 && nota <= 69) {
            System.out.println("D");
        } else if (nota >= 0 && nota <= 60) {
            System.out.println("F");
        }
    }

    public void anoBisiesto() {
        int ano = 0;

        System.out.println("Ingrese el año: ");
        ano = sc.nextInt();

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println("El año " + ano + " es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}