package ejercicio3;

import java.io.*;
import java.util.Scanner;

public class RegistrosDeCurso {
    File archivo = new File("record_academico.txt");
    Scanner sc = new Scanner(System.in);

    public String agregarRegistro() {
        System.out.println("ingrese el nombre del curso: ");
        String curso = sc.nextLine();

        System.out.println("Ingrese la nota final del curso: ");
        int nota = sc.nextInt();

        if (nota >= 70) {
            return curso + "|" + nota + "|" + "Aprobado";
        } else {
           return curso + "|" + nota + "|" + "Reprobado";
        }
    }

    public void guardarRegistro(String regitro) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))) {
            escritor.write(regitro);
            escritor.newLine();

        } catch (IOException e) {
            System.out.println("Error al guardar el registro " + e.getMessage());
        }
    }

    public void mostrarRegistros() {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int aprobados = 0, reprobados = 0;
            System.out.println("----REPORTE DE CURSOS----");
            while ((linea = lector.readLine()) != null) {
                String[] infoRegistro = linea.split("\\|");
                System.out.println("Nombre del curso: " + infoRegistro[0] + "  Nota Final: " + infoRegistro[1] + "  Estado: " + infoRegistro[2]);
                if (infoRegistro[2].equals("Aprobado")) {
                    aprobados++;
                } else {
                    reprobados++;
                }
            }//end while
            System.out.println("Cantidad de cursos aprobados: " + aprobados);
            System.out.println("Cantidad de cursos reprobados: " + reprobados);
            System.out.println("----------------------------------------------");
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error al mostrar el registro " + e.getMessage());
        }

    }
}