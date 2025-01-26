package ejercicio_4_2.inmuebles.models;

public class Apartamento extends InmuebleVivienda {
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
    }

    protected void ApartamentoImprimir() {
        super.InmuebleViviendaImprimir();
    }

}
