package ejercicio_4_2.inmuebles;

import ejercicio_4_2.inmuebles.models.Casa;

public class CasaRural extends Casa {
    protected static double valorArea = 1_500_000;
    protected int distanciaCabecera;
    protected int altitud;


    public CasaRural(int identificadorInmobiliario, int area, String direccion,
                     int numeroHabitaciones, int numeroBanos, int numeroPisos, int distanciaCabecera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);

        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    void CasaRuralImprimir() {
        super.Casaimprimir();
        System.out.println("Distancia a la cabecera: " + this.distanciaCabecera);
        System.out.println("Altitud sobre el nivel del mar: " + this.altitud + " metros" + "\n");
    }
}
