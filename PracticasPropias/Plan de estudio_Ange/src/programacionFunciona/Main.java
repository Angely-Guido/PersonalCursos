package programacionFunciona;

public class Main {
    public static void main(String[] args) {



    Animal perro = new Animal (){
        @Override
        public void hacerSonido() {
            System.out.println("Gua Gua");
        }

    }; //Defino donde termina mi clase anonima con ;

        perro.hacerSonido();
    }
}
