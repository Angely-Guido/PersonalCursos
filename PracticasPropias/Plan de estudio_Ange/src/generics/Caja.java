package generics;

public class Caja <T> { //esa caja puede recibir un tipo de dato generico
    private T contenido; // lo que voy a guardar (cualquier tipo)

    public void ponerAlgo(T contenido){
        this.contenido = contenido;

    }

    public T obtenerAlgo(){
        return contenido;
    }

    public static <T> void intercambiar(T[] vector, int i, int k){
        T temporal = vector[i];
        vector[i] = vector[k];
        vector[k] = temporal;

    }
}
