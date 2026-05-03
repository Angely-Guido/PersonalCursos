package repasoObjetos;

import java.util.ArrayList;

public class ListaContactos {

    private ArrayList<Contacto> contactos;

    public ListaContactos(){
        this.contactos = new ArrayList<>();
    }

    public ListaContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<Contacto> unirContactos(ArrayList<Contacto> lista){
        ArrayList<Contacto> temporal = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            temporal.add(lista.get(i));
        }
        for (int j = 0; j < contactos.size(); j++) {
            temporal.add(contactos.get(j));
        }
        return temporal;
    }

    public ArrayList<Contacto> unirContactos(ArrayList<Contacto> lista, ArrayList<Contacto> lista2){
        ArrayList<Contacto> temporal = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            temporal.add(lista.get(i));
        }
        for (int j = 0; j < lista2.size(); j++) {
            temporal.add(lista2.get(j));
        }
        return temporal;
    }

    @Override
    public String toString() {
        String salida = "";
        for (Contacto c : contactos){
            salida += c.toString() + "\n";
        }
        return salida;
    }
}
