package com.ejemplo;

import com.ejemplo.controller.ControllerApp;
import com.ejemplo.model.RepositorioProducto;
import com.ejemplo.persistencia.PersistenciaApp;
import com.ejemplo.view.ViewApp;

public class MainApp {
    public static void main(String[] args) {

        RepositorioProducto model = RepositorioProducto.getInstance();
        ViewApp vista = new ViewApp();
        PersistenciaApp data = new PersistenciaApp();
        ControllerApp controlador = new ControllerApp(model, vista, data);

        controlador.iniciarApp();
    }


}