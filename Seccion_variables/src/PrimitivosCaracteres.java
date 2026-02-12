public class PrimitivosCaracteres {

    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal ==caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == decimal));
        System.out.println("Char corresponde en byte a: " + Character.BYTES);
        System.out.println("char corresponde en bites a: " + Character.SIZE);
        System.out.println("maximo de char: " + Character.MAX_VALUE);
        System.out.println("minimo de char: " + Character.MIN_VALUE);

        char espacio = '\u0020';
        char retroceso = '\b'; //elimina un caracter o espacio hacia atras
        char tabulador = '\t'; //genera un espacio mas amplio
        char nuevaLinea = '\n'; //salto de linea
        char retornoCarro = '\r'; //

        //System.getproperty(line.separator): nueva linea

    }
}
