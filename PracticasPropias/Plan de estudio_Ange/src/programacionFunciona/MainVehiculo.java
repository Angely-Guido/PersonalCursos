package programacionFunciona;

public class MainVehiculo {
    public static void main(String[] args) {


        new Vehiculo() {
            private int numPasajeros;

            public void manejar() {
                System.out.println("Estoy manejando");
            }

        }.manejar();


    }
}
