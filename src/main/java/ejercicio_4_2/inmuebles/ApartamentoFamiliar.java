package ejercicio_4_2.inmuebles;

import ejercicio_4_2.inmuebles.models.Apartamento;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2_000_000;
    protected int valorAdministracion;


    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion,
                               int numeroHabitaciones, int numeroBanos, int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }

    void ApartamentoFamImprimir(){
        super.ApartamentoImprimir();
        System.out.println("Valor de la administración: $" + this.valorAdministracion + "\n");
    }
}
