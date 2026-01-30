package com.ejemploCalcu.main;

import com.ejemploCalcu.controller.CMat;
import com.ejemploCalcu.model.MMat;
import com.ejemploCalcu.view.VMat;

public class Main {
    public static void main(String[] args) {
        MMat model = new MMat();
        VMat vista = new VMat();
        CMat controlador = new CMat(model, vista);
        controlador.iniciarApp();
    }

}
