public class Pila {

    private int[] pila;
    private int TOP;
    private int apunt;


    public Pila() {
        pila = new int [21];
        TOP =20;
        apunt = 0;
    }

    public Pila(int tamaño){
        pila = new int[tamaño+1];
        TOP = tamaño;
        apunt = 0;

    }

    public boolean pilaLlena(){
        return apunt ==TOP;
    }
    public boolean pilaVacia(){
        return apunt ==0;
    }

    public void ingresarElemento(int y){
        pila[++apunt] = y;
    }

    public int eliminarElemento(){
        return pila[apunt--];
    }

    public String ckIngresarElemento(int y){
        String sal = "";
        if(!pilaLlena()){
            ingresarElemento(y);
            return "Pila normal, elemnteo" + y+ " ingresado";
        }else {
            return "Pila llena, elemento" + y + "no ingresara";
        }
    }


    public String ckIngresarElemento() {
        String sal = "";
        if (!pilaLlena()) {
            return "Pila normal, elemnteo sera ingresado";
        } else {
            return "Pila llena, elemento no sera ingresado";
        }
    }

    public String ckEliminarElemento() {
        String sal = "";
        if (!pilaVacia()) {
            return "Pila normal, elemnteo sera ELIMINADO";
        } else {
            return "Pila llena, elemento no sera ELIMINADO";
        }
    }

    public String toString()
    {
        String salida="\n";
        for(int i=pila.length-1;i>0;i--){
            salida+=i+"["+pila[i]+"]";
            if(i==pila.length-1){
                salida+="<==TOP";
            }
            if(i==apunt){
                salida+="<==Apunt";
            }
            salida+="\n";
        }
        salida+="Apunt="+apunt+"\n";
        return salida;
    }//fin del metodo toString


    public static void main(String[] args) {
        Pila p = new Pila();
        System.out.println(p);
        System.out.println("Llena? " + p.pilaLlena());
        System.out.println("Vacia? " + p.pilaVacia());
        p.ingresarElemento(8);
        p.ingresarElemento(3);
        p.ingresarElemento(56);
        p.ingresarElemento(16);
        p.ingresarElemento(34);
        p.ingresarElemento(55);
        p.ingresarElemento(21);
        p.ingresarElemento(8);
        p.ingresarElemento(12);
        p.ingresarElemento(42);
        p.ingresarElemento(65);
        System.out.println(p);

    }
}
