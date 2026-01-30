package com.conversor.main;

import com.conversor.controller.CMone;
import com.conversor.model.MMone;
import com.conversor.view.VMone;

public class Main {
    public static void main(String[] args) {

        MMone modelo = new MMone();
        VMone vista = new VMone();
        CMone controlador = new CMone(modelo, vista);

        controlador.iniciarApp();
    }
}
