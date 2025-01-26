package ejercicio_4_2.inmuebles;

import ejercicio_4_2.inmuebles.models.Local;

public class Oficina extends Local {
    protected static double valorArea = 3_500_000;
    protected boolean esGobierno;



    protected Oficina(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    void oficinaImprimir() {
        super.Localimprimir();
        System.out.println("Es oficina gubernamental: " + this.esGobierno);
    }


}
