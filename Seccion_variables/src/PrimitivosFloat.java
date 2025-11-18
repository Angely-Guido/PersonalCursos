public class PrimitivosFloat {

    public static void main(String[] args) {


        float realFloat = 2.12e3f;

        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a: " + Float.BYTES);
        System.out.println("Float corresponde en bites a: " + Float.SIZE);
        System.out.println("maximo de float: " + Float.MAX_VALUE);
        System.out.println("minimo de float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a: " + Double.BYTES);
        System.out.println("Double corresponde en bites a: " + Double.SIZE);
        System.out.println("maximo de double: " + Double.MAX_VALUE);
        System.out.println("minimo de double: " + Double.MIN_VALUE);
        
        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
        
    }
}
