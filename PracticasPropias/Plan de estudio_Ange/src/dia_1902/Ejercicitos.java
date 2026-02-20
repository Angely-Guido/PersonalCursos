package dia_1902;

public class Ejercicitos {
    public static void main(String[] args) {
      //  inversor("java");
        System.out.println(reversa("super"));

    }

    public static void inversor(String palabra) {
        String reverso = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            reverso += palabra.charAt(i);

        }
        System.out.println(reverso);
    }

    public static String reversa(String palabra){
        String palabraInvertida = "";

       char[] nuevaArray = palabra.toCharArray();

        for (int i = nuevaArray.length-1; i >= 0 ; i--) {
            palabraInvertida += nuevaArray[i];

        }
        return palabraInvertida;
    }
}
