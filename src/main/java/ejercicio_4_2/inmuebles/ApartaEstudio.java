package ejercicio_4_2.inmuebles;

import ejercicio_4_2.inmuebles.models.Apartamento;

public class ApartaEstudio extends Apartamento {
    protected static double valorArea = 1_500_000;


    public ApartaEstudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
                         int numeroBanos) {
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitación y un solo baño
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }

    void AparaEstudioImpimir(){
        super.ApartamentoImprimir();
    }
}
