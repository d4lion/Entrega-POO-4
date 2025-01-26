package ejercicio_4_2.inmuebles;

public class CasaIndependiente extends CasaUrbana{
    protected static double valorArea = 3_000_000;

    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }

    void CasaIndependienteImprimir() {
        super.CasaUrbanaImprimir();
    }
}
