public class FuncionesAlcance {
    /*
     EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.


     */

    public void ejemplo1(){
        System.out.println("Soy un metodo void sin parametros");
    }

    public void ejemplo2(String nombre, int edad){
        System.out.println(" Mi nombre es " + nombre + " y mi edad es " + edad);
    }

    public int ejemplo3(int n, int n1){
        int total = n + n1;
        return total;
    }



    public int prueba1(String s1, String s2){
        int cont = 0;
        for (int i = 1; i <=100; i++) {
            if(i % 3 == 0){
                System.out.println( "El numero "+ i + " tiene la palabra "+ s1);
                cont++;
            }
            if (i % 5 ==0){
                System.out.println( "El numero "+ i + " tiene la palabra "+ s2);
                cont++;
            }
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println(s1 + s2);
                cont++;
            }

        }
        return cont;
    }

}
