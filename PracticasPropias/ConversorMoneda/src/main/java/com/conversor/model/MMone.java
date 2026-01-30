package com.conversor.model;

public class MMone {

    static final double COLONES = 530;

    public double colones(double dolares){
        return dolares * COLONES;
    }

    public double dolares(double colones){
        return colones / COLONES;
    }
}
