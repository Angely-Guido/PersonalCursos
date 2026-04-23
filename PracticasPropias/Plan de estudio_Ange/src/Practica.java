public class Practica {

    public static void main(String[] args) {
        int[][] tabla = new int[4][];
        tabla[0] = new int [3];
        tabla[1] = new int [1];
        tabla[2] = new int [5];
        tabla[3] = new int [7];
        //System.out.println(tabla[0].length);

        DosEnUno(tabla);

    }

    public static void DosEnUno(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*50);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+ matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }


}
