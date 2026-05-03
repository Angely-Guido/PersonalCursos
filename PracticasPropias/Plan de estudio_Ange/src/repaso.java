public class repaso {

    public static int sumaDigitos(int numero){
        int sumaTotal = 0;

        while(numero >= 10){
            sumaTotal += numero % 10;
            numero /= 10;

        }
        return sumaTotal + numero;

    }

    public static int contarDigitos(int numero){
        int contar = 0;
        while(numero >= 10){
             contar++;
             numero /=10;
        }
        return contar + 1;

    }

    public static  int potencia(int base, int exponente){
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static boolean isArmstrong(int numero){
        int copia = numero;
        int sumar =0;
        int nDigitos = contarDigitos(numero); // saber quien es n
        while(numero >= 10){ //mientras numero sea mayor a 10
            int modulo = numero % 10; //sacar modulo
            int elevar = potencia(modulo, nDigitos); //elevarlos a n
            sumar += elevar; //sumar
            numero /= 10;
        }

        sumar+=potencia(numero, nDigitos);

        if(sumar == copia){
            return true;
        }
        return false;
    }

    public static boolean isArmstrongV2(int numero) {
        int copia = numero;
        int sumar = 0;
        int nDigitos = String.valueOf(numero).length(); // saber quien es n
        while (numero >= 10) { //mientras numero sea mayor a 10
            int modulo = numero % 10; //sacar modulo
            sumar += (int) Math.pow(modulo, nDigitos); //elevarlos a n
            numero /= 10;
        }
        sumar += potencia(numero, nDigitos);
        return sumar == copia;
    }


    public static void main(String[] args) {
        //System.out.println(repaso.sumaDigitos(124));
        //System.out.println(repaso.contarDigitos(12));
        //System.out.println(repaso.potencia(3, 0));
        //System.out.println(isArmstrong(8208));
        System.out.println(isArmstrongV2(8208));

    }

}
