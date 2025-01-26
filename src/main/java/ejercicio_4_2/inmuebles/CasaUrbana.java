package ejercicio_4_2.inmuebles;

import ejercicio_4_2.inmuebles.models.Casa;

public class CasaUrbana extends Casa {
    public CasaUrbana(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }

    void CasaUrbanaImprimir() {
        super.Casaimprimir();
    }
}
