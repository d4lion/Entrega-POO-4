package ejercicio_4_2.inmuebles.models;

public class Casa extends InmuebleVivienda {
    protected int numeroPisos;

    public Casa(int identificadorInmobiliario, int area, String direccion,
                int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroPisos;
    }

    protected void Casaimprimir() {
        super.InmuebleViviendaImprimir();
        System.out.println("Número de pisos: " + numeroPisos);
    }
}
