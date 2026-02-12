package ejercicio2;

import java.io.*;
import java.util.Scanner;

public class ControlDeGastos {

    Scanner sc = new Scanner(System.in);

    File archivo = new File("gastos.csv");


    public void registrarGastos() {
        System.out.println("Descripcion: ");
        String desc = sc.nextLine();

        System.out.println("Monto: ");
        String monto = sc.nextLine();

        System.out.println("Categoria: ");
        String categoria = sc.nextLine();

        String info = desc + ";" + monto + ";" + categoria;

        try (BufferedWriter escribrir = new BufferedWriter(new FileWriter(archivo, true))) {
            escribrir.write(info);
            escribrir.newLine();


        } catch (IOException e) {
            System.out.println("Error al registrar gasto" + e.getMessage());
        }
    }

        public void verReporte(){

        try(BufferedReader leer = new BufferedReader(new FileReader(archivo))){
            String linea;
            double totalGasto = 0;
            System.out.println("Historial de gastos");
            while((linea = leer.readLine()) !=null){
                String[] infoGasto = linea.split(";");
                System.out.println("Descripcion del gasto: " + infoGasto[0]);
                System.out.println("Descripcion del gasto: " + infoGasto[1]);
                System.out.println("Descripcion del gasto: " + infoGasto[2]);
                System.out.println("----------------------------------------");
                totalGasto += Double.parseDouble(infoGasto[1]);
            }
            System.out.println("Total gastado: " + totalGasto);

        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }

        }








}
