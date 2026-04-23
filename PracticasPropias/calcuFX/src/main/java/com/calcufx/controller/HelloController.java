package com.calcufx.controller;

import com.calcufx.model.Cal;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    Cal calcular = new Cal();

    @FXML
    private TextField numA;

    @FXML
    private TextField numB;

    @FXML
    private RadioButton suma;

    @FXML
    private RadioButton resta;

    @FXML
    private RadioButton mult;

    @FXML
    private RadioButton div;

    @FXML
    private TextField respuesta;


    @FXML
    public void calcular() {
        String campoA = numA.getText();
        double num1 = Integer.parseInt(campoA);

        String campoB = numB.getText();
        double num2 = Integer.parseInt(campoB);

        if (suma.isSelected()) {
            double resultado = calcular.suma(num1, num2);
            String campoRespuesta = String.valueOf(resultado);
            respuesta.setText(campoRespuesta);

        } else if (resta.isSelected()) {
            double resultado = calcular.resta(num1, num2);
            String campoRespuesta = String.valueOf(resultado);
            respuesta.setText(campoRespuesta);

        } else if (mult.isSelected()) {
            double resultado = calcular.multiplicacion(num1, num2);
            String campoRespuesta = String.valueOf(resultado);
            respuesta.setText(campoRespuesta);

        } else {
            double resultado = calcular.division(num1, num2);
            String campoRespuesta = String.valueOf(resultado);
            respuesta.setText(campoRespuesta);
        }
    }

    public void limpiar(){
        
    }
}
