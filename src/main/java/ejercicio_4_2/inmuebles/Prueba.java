package ejercicio_4_2.inmuebles;

public class Prueba {
    public static void main(String ... args) {
        ApartamentoFamiliar aptoFam = new ApartamentoFamiliar(103067,120,
                "Avenida Colombia 80-80",3,2,200000);
        System.out.println("Datos del apartamento familiar");
        aptoFam.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        aptoFam.ApartamentoFamImprimir();

        ApartaEstudio aptoEst = new ApartaEstudio(12354,50,
                "Avenida Caracas 30-15",1,1);
        System.out.println("Datos del apartaestudio");
        aptoEst.calcularPrecioVenta(ApartaEstudio.valorArea);
        aptoEst.AparaEstudioImpimir();
    }
}
