/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ahorcado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Modelo {
    
    private int intentosMax;
    private int contador;
    private ArrayList<String> bancoPalabras;
    private String palabraSecreta;
    
    
    public Modelo(int intentosMax) {
        bancoPalabras = new ArrayList<>(List.of("casa", "sol", "lunes", "hogar", "amanecer"));
        this.palabraSecreta = escogerPalabraSecreta();
        this.intentosMax = intentosMax;
        this.contador = 0;
    }
    
    public String getPalabraSecreta(){
        return palabraSecreta;
    }
    
    public int getIntentosMax(){
        return intentosMax;
    }
    
    public int getContador(){
        return contador;
    }
    
    public void setPalabraSecreta(String palabraSecreta){
        this.palabraSecreta = palabraSecreta;
    }
    
    public void setIntentosMax(int intentosMax){
        this.intentosMax = intentosMax;
    }
    
    public void setContador(int contador){
        this.contador = contador;
    }
    
    public String escogerPalabraSecreta(){
        int palabraAleatoria = (int) (Math.random()*bancoPalabras.size());
        return bancoPalabras.get(palabraAleatoria);
    }
    
    
    public void validarLetra(char letra){
        int contCoin =0;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if(palabraSecreta.charAt(i) == letra){
                contCoin++;
                contador++;
            }
        }
        if(contCoin == 0){
            intentosMax--;
        }
    }
    
    public boolean juegoTerminado(){
        if(contador == palabraSecreta.length()){
            System.out.println("Ganaste");
            return true;
        }else if(intentosMax == 0){
            System.out.println("Ahorcado");
            return true;
        }else{
            return false;
        }
    }
    

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Modelo m = new Modelo(4);
        while(!m.juegoTerminado()){
            System.out.println(m.escogerPalabraSecreta());
            System.out.println("Ingrese una letra: " + "Intentos restantes: " + m.intentosMax);
            char letra = sc.nextLine().charAt(0);
            m.validarLetra(letra);
            
        }
        
        
    }
    
    
}
