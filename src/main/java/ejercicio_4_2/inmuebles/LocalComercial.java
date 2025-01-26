package ejercicio_4_2.inmuebles;

import ejercicio_4_2.inmuebles.models.Local;

public class LocalComercial extends Local {
    protected static double valorArea = 3_000_000;
    protected String centroComercial;

    protected LocalComercial(int identificadorInmobiliario, int area,
                             String direccion, Local.tipo tipoLocal, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    void localComercialImprimir() {
        super.Localimprimir();
        System.out.println("Centro comercial: " + this.centroComercial);
    }
}
