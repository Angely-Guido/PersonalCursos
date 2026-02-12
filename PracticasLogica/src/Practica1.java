public class Practica1 {

    static public void imprimir(int entero){
        System.out.println("Recibe un entero: " + entero);
    }
    static public void imprimir(double decimal){
        System.out.println("Recibe decimal: "+ decimal);
    }
    static public void imprimir(String cadena){
        System.out.println("Recibe cadena: "+ cadena);
    }

    public static void main(String[] args) {
        Practica1.imprimir(8.0);

    }
}
