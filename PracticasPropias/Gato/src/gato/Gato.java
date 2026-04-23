/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gato;

/**
 *
 * @author angel
 */
public class Gato {
    
    private char[][] matriz;
    private int turno;
    
    
    public Gato(){
        this.matriz = new char[3][3];
        this.turno = 0;
        
    }
    
    public char[][] getMatriz(){
        return matriz;
    }
    
    public void setMatriz(char[][] matriz){
        this.matriz = matriz;
    }
    
    public int getTurno(){
        return turno;
    }
    
    public void setTurno(int turno){
        this.turno = turno;
    }
    
    public void actualizarTurno(){
        if(turno == 1){
            turno = 0;
        }else{
            turno++;
        }
    }
    
    
    
    public void jugada(int fila, int columna){
        if(jugadaValida(fila, columna) && (turno ==0)){
            matriz[fila][columna] = 'X';
            actualizarTurno();
        }else if(jugadaValida(fila, columna) && (turno ==1)){
            matriz[fila][columna] = '0';
            actualizarTurno();
        }else{
            System.out.println("Jugada invalidad");
        }
        
    }
    
    public boolean jugadaValida(int fila, int columna){
        return matriz[fila][columna] != 'X' && matriz[fila][columna] != 'O';
    }
    
    public boolean validarFilas() {
        int coincidencias = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (turno == 0 && matriz[i][j] == 'X') {
                    coincidencias++;

                } else if (turno == 1 && matriz[i][j] == 'O') {
                    coincidencias++;
                }
            }
            if (coincidencias == 3) {
                return true;
            }
        }
        return false;
    }
    
        public boolean validarColumnas() {
        int coincidencias = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (turno == 0 && matriz[j][i] == 'X') {
                    coincidencias++;

                } else if (turno == 1 && matriz[j][i] == 'O') {
                    coincidencias++;
                }
            }
            if (coincidencias == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean validarDP() {
        int coincidencias = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (turno == 0 && matriz[i][i] == 'X') {
                coincidencias++;

            } else if (turno == 1 && matriz[i][i] == 'O') {
                coincidencias++;
            }
        }
        if (coincidencias == 3) {
            return true;
        }
        return false;
    }

    public boolean validarDS() {
        int coincidencias = 0;
        int aumentador = 1;
        for (int i = 0; i < matriz.length; i++) {
            if (turno == 0 && matriz[i][matriz[0].length - aumentador++] == 'X') {
                coincidencias++;

            } else if (turno == 1 && matriz[i][i] == 'O') {
                coincidencias++;
            }
        }
        if (coincidencias == 3) {
            return true;
        }
        return false;
    }

    public void imprimir(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                
            }
            System.out.println();
            
        }
    }
    
    public static void main(String[] args) {
        Gato g = new Gato();
        System.out.println(g.getTurno());
        g.jugada(0, 2);
        g.imprimir();
        g.setTurno(0);
        System.out.println(g.getTurno());
        g.jugada(1, 1);
        g.imprimir();
        g.setTurno(0);
        g.jugada(2, 0);
        g.imprimir();
        g.setTurno(0);
        if(g.validarDS()){
            System.out.println("Ganaste jugador " + g.getTurno());
        }else{
            System.out.println("Aun nada");
        }
       
         
        
    }
    
}
