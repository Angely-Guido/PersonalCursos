public class ContadorDePares {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,5,6,7,8,9};

        int par = 0;
        int impar = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2 == 0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("Hay de pares: "+ par);
        System.out.println("Hay de impares: "+ impar);
    }
}
